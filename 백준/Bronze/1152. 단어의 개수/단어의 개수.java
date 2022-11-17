import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
        bufferedReader.close();
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        int count = 0;
        while (stringTokenizer.hasMoreTokens()) {
            stringTokenizer.nextToken();
            count++;
//            bufferedWriter.write(stringTokenizer.nextToken());
//            bufferedWriter.newLine();
        }
        bufferedWriter.write(count+"");
        bufferedWriter.flush();
        bufferedReader.close();
    }
}
