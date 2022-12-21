package programmers;

public class 옹알이1 {
    public static int solution2(String[] babbling) {
        int answer = 0;
        String[] pronunciations = {"aya", "ye", "woo", "ma"};
        for (String bab : babbling) {
            for (String pronunciation : pronunciations) {
                bab = bab.replace(pronunciation, " ");
            }
            if(bab.replace(" ", "").length() == 0) answer++;
        }
        return answer;
    }
    public static int solution(String[] babbling) {
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
