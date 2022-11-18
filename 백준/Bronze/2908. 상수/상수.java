import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
        bufferedReader.close();
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        StringBuilder builder = new StringBuilder(stringTokenizer.nextToken());

        String max = builder.reverse().toString();
        while (stringTokenizer.hasMoreTokens()) {
            builder = new StringBuilder(stringTokenizer.nextToken());
            String tmp = builder.reverse().toString();
            if(max.compareTo(tmp)<0) max = tmp;
        }
        bufferedWriter.write(max);
        bufferedWriter.flush();
        bufferedReader.close();
    }
}
