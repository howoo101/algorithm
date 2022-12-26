class Solution {
    public String[] solution(int N, int[] arr1, int[] arr2) {
        String[] answers = new String[N];
        String digit = "%0" + N + "d";
        for (int i = 0; i < N; i++) {
            String answer = String.format(digit, Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i])))
                    .replace("1", "#").replace("0", " ");
            answers[i] = answer;
        }
        return answers;
    }
}