package String;

import java.util.Scanner;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * <p>
 * 입력
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * 출
 * 첫 줄에 자연수를 출력합니다.
 */
public class 숫자만추출 {
    public int solution(String input) {
        input = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(input);
    }

    public int solution2(String input) {
        int i = 0;
        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9') {
                i = i*10 + (c - '0');
            }
            System.out.println(i);
        }
        return i;
    }

    public int solution3(String input) {
        StringBuilder s = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) s.append(c);
        }
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(new 숫자만추출().solution2(input1));
    }
}