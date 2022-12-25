package array;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(Arrays.toString(new 피보나치수열().solution(input1)).replaceAll("[^0-9,]", "")
                .replace(",", " "));
        for(int x :new 피보나치수열().solution(input1))
            System.out.print(x + " ");
    }

    private int[] solution(int input1) {
        int[] answer = new int[input1];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < input1; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }
}