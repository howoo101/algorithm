package String;

import java.util.Scanner;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class 특정문자뒤집기 {
    public String solution(String input) {
        char[] chars = input.toCharArray();
        int i = 0;
        int y = chars.length - 1;
        do {
            if (Character.isAlphabetic(chars[i])) {
                if (Character.isAlphabetic(chars[y])) {
                    char tmp = chars[i];
                    chars[i] = chars[y];
                    chars[y] = tmp;
                    i++;
                }
                y--;
            } else {
                i++;
            }
        } while (i < y);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(new 특정문자뒤집기().solution(input1));
    }
}