import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //array 기준으로 start부터 end까지 자르고
        
        for(int i = 0; i < commands.length; i++) {
            int[] tmp = commands[i];
            int start = tmp[0];    //-> i
            int end = tmp[1];   //-> j   
            int idx = tmp[2];   //-> k (요넘이 정답)   
            int[] slice =  Arrays.stream(array, start-1, end)
                                 .toArray();
            Arrays.sort(slice);
            answer[i] = slice[idx-1];
        }
        
        return answer;
    }
}