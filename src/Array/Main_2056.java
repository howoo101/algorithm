package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2056 {
    public static void main(String[] args) throws IOException {
        int n = 9;
        int row = 0;
        int col = 0;
        int max = -1;
        int[] answer = {0, 0};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                int tmp = Integer.parseInt(st.nextToken());
                if (max < tmp) {
                    answer[0] = row;
                    answer[1] = col;
                    max = tmp;
                }
                col++;
            }
            row++;
            col = 0;
        }
        br.close();
        System.out.println(max);
        System.out.println((answer[0] + 1) + " " + (answer[1] + 1));
    }
}
