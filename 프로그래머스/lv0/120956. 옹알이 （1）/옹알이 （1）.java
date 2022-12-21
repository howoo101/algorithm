class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            String result = s.replace("aya", " ").replace("ye", " ").replace("woo", " ").replace("ma", " ").replace(" ","");

            if (result.length() == 0) {
                answer ++;
            }
        }
        return answer;
    }
}