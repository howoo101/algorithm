import java.io.*;
import java.util.*;

public class Main {
    static int answer = 1;
    static int answer2 = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        fibo(N);
        fibona(N);

        bw.write(String.valueOf(answer));
        bw.write(" ");
        bw.write(String.valueOf(answer2));
        bw.flush();

        bw.close();
        br.close();
    }

    static int fibo(int n) {
        if (n == 1 || n == 2) return 1;
        answer++;
        return fibo(n - 2) + fibo(n - 1);
    }

    static int fibona(int n) {
        int[] arr = new int[n+1];
        arr[1] = 1; arr[2] = 1;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            answer2++;
        }
        return arr[n];
    }
}