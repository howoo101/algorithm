import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        final int ARR_SIZE = 10;
        final int N = 3;
        final int THIRD = ARR_SIZE - N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] tmp = br.readLine().split(" ");
            int[] ints = Arrays.stream(tmp).mapToInt(Integer::parseInt)
                    .sorted().toArray();
            bw.write(String.valueOf(ints[THIRD]));
            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();

    }

}
