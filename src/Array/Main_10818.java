package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10818 {
    /*
        입력:
        첫째줄 정수 갯수 1<= N  <= 1,000,000
        둘째줄 정수...
        출력: 띄어쓰기로
        최소 최대
     */
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫줄 N
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = 10000001;
        int max = -10000001;

        br.close();
        while (st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            if (min > tmp) {
                min = tmp;
            }
            if (max < tmp) {
                max = tmp;
            }

        }

        System.out.println(min + " " + max);


    }
}
