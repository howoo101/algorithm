import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫줄 N
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = 10000001;
        int max = -10000001;


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
