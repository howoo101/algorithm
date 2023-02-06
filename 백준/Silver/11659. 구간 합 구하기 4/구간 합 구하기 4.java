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
        int[] sums = new int[arrs.length+1];
        int sum = 0;
        for (int i = 1; i < sums.length; i++) {
            sum += arrs[i-1];
            sums[i] = sum;
        }

        for (int i = 0; i < Integer.parseInt(sizeAndCount[1]); i++) {
            String[] startToEnd = br.readLine().split(" ");
            int startIdx = Integer.parseInt(startToEnd[0]);
            int endIdx = Integer.parseInt(startToEnd[1]);
            System.out.println(sums[endIdx] - sums[startIdx-1]);
        }
    }
}