package twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최대매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    10 3
//    12 15 11 20 25 10 20 19 13 15
        int[] inputs = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = inputs[0];
        int K = inputs[1];
        int[] sales = Arrays.stream(bf.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        bf.close();
        System.out.println(new 최대매출().solution2(N,sales, K));
    }

    private int solution(int[] sales, int K) {
        int max = 0;
        int end = K;
        for (int start = 0; start < sales.length - K; start++,end++) {
            int tmp = 0;
            for (int i = start; i < end; i++) {
                tmp += sales[i];
            }
            max = Math.max(tmp, max);
        }
        return max;
    }

    private int solution2(int N,int[] sales, int K) {
        int max = 0;
        int end = K;
        for (int start = 0; start <  end; start++) {
            max += sales[start];
        }
        int tmp = max;
        for(int start = 0; start < sales.length-K; start++,end++) {
            int nextNum = sales[end];
            int firstNum = sales[start];
            tmp += nextNum-firstNum;
            max = Math.max(tmp, max);

        }
        return max;
    }
}