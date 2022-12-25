package array;

import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int i1 = scanner.nextInt();
            int answer = new 뒤집은소수().solution(i1);
            if(answer!= 1) {
                System.out.print(answer + " ");
            }
        }
    }

    private int solution(int i1) {
        int reverseNumber = getReverseNumber(i1);

        return getPrimeNumber(reverseNumber);


    }

    // 숫자 뒤집는 함수
    private int getReverseNumber(int number) {

        int reverseNumber = 0;

        do {
            reverseNumber *= 10;
            reverseNumber += number % 10;
        } while ((number /= 10) != 0);
//        System.out.println("reverseNumber = " + reverseNumber);
        return reverseNumber;
    }

    private int getPrimeNumber(int N) {
        int[] arr = new int[N + 1];
        if (N < 2) {
            arr[0] = 1;
            arr[1] = 1;
        }

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                for (int j = i; j <= N; j += i) if (i != j) arr[j] = 1;
            }
        }

        return arr[N] == 1 ? 1 : N;
    }


}
