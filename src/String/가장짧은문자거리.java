package String;

import java.util.Arrays;
import java.util.Scanner;

public class 가장짧은문자거리 {
    public void solution(String input1, String input2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input1.toCharArray().length; i++) {
            sb.insert(0, input1.charAt(i));
            int right = input1.substring(i).indexOf(input2);
            int left = sb.indexOf(input2);
            int min = Math.min(left, right);
            if (min != -1)
                System.out.print(min);
            else
                System.out.print(Math.max(left, right));
            if (i != input1.toCharArray().length - 1)
                System.out.print(" ");
        }
    }

    public void solution2(String s,char t) {
        int d = 1000;
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(t == s.charAt(i)) {
                d = 0;
            }
            else {
                d++;
            }
            answer[i] = d;
        }
        d = 1000;
        for (int i = answer.length - 1; i >= 0; i--) {
            if(t == s.charAt(i)) {
                d = 0;
            }
            else {
                d++;
                answer[i] = Math.min(answer[i], d);
            }
        }
        System.out.println(Arrays.toString(answer));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");

//        new 가장짧은문자거리().solution(input[0], input[1]);
        new 가장짧은문자거리().solution2(input[0], input[1].charAt(0));

    }
}