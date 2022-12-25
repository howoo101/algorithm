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
        if(isPrimeNumber(reverseNumber))
            return reverseNumber;
        return 1;
    }

    // 숫자 뒤집는 함수
    private int getReverseNumber(int number) {
        int reverseNumber = 0;

        do {
            reverseNumber = reverseNumber * 10 +  number % 10;
        } while ((number /= 10) != 0);
//        System.out.println("reverseNumber = " + reverseNumber);
        return reverseNumber;
    }

    private boolean isPrimeNumber(int N) {
        if (N < 2) return false;

        for (int i = 2; i < N; i++) {
            if (N%i == 0) return false;
        }
        return true;
    }


}
