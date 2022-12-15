package String;

import java.util.Locale;
import java.util.Scanner;

/**
 * 설명
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 */
public class 문자찾기 {
    public static int solution(String input1, char input2) {
        input1 = input1.toUpperCase();
        input2 = Character.toUpperCase(input2);
        int count = 0;
        for (char c : input1.toCharArray()) {
            if (c == input2) count++;
        }
        /**
         for (int i = 0; i < input1.length(); i++) {
         if(input1.charAt(i) == input2) count++;
         }
         **/
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        char input2 = scanner.next().charAt(0);
        System.out.println(solution(input1, input2));
    }
}
