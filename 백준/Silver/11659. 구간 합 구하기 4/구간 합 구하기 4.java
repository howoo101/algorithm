import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizeAndCount = br.readLine().split(" ");
        String[] str = br.readLine().split(" ");
        int[] arrs = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int[] sums = new int[arrs.length];
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            sum += arrs[i];
            sums[i] = sum;
        }

        for (int i = 0; i < Integer.parseInt(sizeAndCount[1]); i++) {
            String[] startToEnd = br.readLine().split(" ");
            int startIdx = Integer.parseInt(startToEnd[0]);
            int endIdx = Integer.parseInt(startToEnd[1]);
            if(startIdx > 1)
                System.out.println(sums[endIdx-1] - sums[startIdx-1] + arrs[startIdx-1]);
            else System.out.println(sums[endIdx-1]);
        }






    }
}