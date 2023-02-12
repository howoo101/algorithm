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
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input!=0) arrayList.add(input);
            else {
                if (arrayList.size() >0) {
                    arrayList.remove(arrayList.size()- 1);
                }
            }
        }
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}