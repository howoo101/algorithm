class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pronunciations = {"aya", "ye", "woo", "ma"};
        for (String bab : babbling) {
            int cnt = 0;
            for (String pronunciation : pronunciations) {
                if (bab.contains(pronunciation)) {
                    cnt += pronunciation.length();
                    if (cnt == bab.length()) {
                        answer++;
                        break;
                    }
                }
            }

        }
        return answer;
    }
}