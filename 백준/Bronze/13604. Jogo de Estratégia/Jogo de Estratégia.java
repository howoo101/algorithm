import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int player = Integer.parseInt(stringTokenizer.nextToken());
        int round = Integer.parseInt(stringTokenizer.nextToken());
        int[] scores = new int[player];
        stringTokenizer = new StringTokenizer(br.readLine());
        int scroesLength = stringTokenizer.countTokens();
        for (int i = 0; i < scroesLength; i++) {
            int score = Integer.parseInt(stringTokenizer.nextToken());
            scores[i%player] += score;
        }
        int maxIdx = 0;
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] >= max) {
                max = scores[i];
                maxIdx = i;
            }
        }
        bw.write(String.valueOf(maxIdx+1));
        bw.flush();
        bw.close();
        br.close();
    }
}
