import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int solution(int k, int[] tangerine) {
        int answer = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for (int key : tangerine) {
            // map.put(key,map.getOrDefault(key, 0)+1);
            map.merge(key,1,Integer::sum);
        }

        Integer[] values = map.values().toArray(Integer[]::new);
        Arrays.sort(values);
        int sum = 0;
        int count = 0;
        for (int i = values.length - 1; i >= 0; i--,count++) {
            sum += values[i];
            if(sum >= k) {
                return count + 1;
            }
        }
        return answer;
    }
}