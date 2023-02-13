import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            ArrayList<Character> arrayList = new ArrayList<>();
            if(chars.length%2==1) {
                bw.write("NO");
                bw.newLine();
                continue;
            }
            for (char input : chars) {
                if(input == '(') arrayList.add(input);
                else {
                    if (!arrayList.isEmpty() && arrayList.contains('(')) {
                        arrayList.remove(arrayList.size()- 1);
                    } else arrayList.add(input);
                }
            }
            if(arrayList.size()==0) bw.write("YES");
            else bw.write("NO");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}