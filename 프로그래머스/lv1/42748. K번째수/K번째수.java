class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        //일단 commands 돌면서 i j k를 얻어야한다.
        //그다음 i j만큼 for문 돌아서 배열 얻어내고 
        //정렬한다음에 k번째 얻어내기 
        
        int start = 0 ;
        int end = 0;
        int seq = 0;
        int[] b = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            start = commands[i][0];
            end = commands[i][1];
            seq = commands[i][2];
            int[] a = new int[end-start+1];
            for(int j = start-1; j < end; j++) {
                a[j-start+1]=array[j];
            }
            java.util.Arrays.sort(a);
            b[i] = a[seq-1];   
        }
        answer = b;
        return answer;
    }
}