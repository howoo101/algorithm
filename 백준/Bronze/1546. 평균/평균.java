import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countOfSubject = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (stringTokenizer.hasMoreTokens()) {
            int tmp = Integer.parseInt(stringTokenizer.nextToken());
            sum += tmp;
            if(max < tmp) max = tmp;
        }
        double v = sum / (double) max * 100 / countOfSubject;
        System.out.println(v);

    }
}