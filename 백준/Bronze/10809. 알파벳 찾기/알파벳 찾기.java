import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuffer bf = new StringBuffer();
        for (int i = 'a'; i <= 'z'; i++) {
            bf.append(S.indexOf(i)).append(" ");
        }
        System.out.println(bf);
    }
}