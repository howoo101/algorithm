import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        // for(int i = 0; i < a.length(); i++) {
        //     answer += n%10;
        //     n /=10;
        // }
        String[] arr = a.split("");
        for(String tmp : arr) {
            answer += Integer.parseInt(tmp);
        }

        return answer;
    }
}