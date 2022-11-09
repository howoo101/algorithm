import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //testCase count
        int C = Integer.parseInt(bf.readLine());
        List<String> answer = new ArrayList<>();
        for(int i = 0; i<C; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            //명수
            int N = Integer.parseInt(st.nextToken());
            int sum = 0;
            int[] arr = new int[N];
            for (int j = 0; j<N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                arr[j] = tmp;
                sum += tmp;
            }
            double avg = (double)(sum/N);
            int count = 0;
            for(int tmp: arr) {
                if(tmp >avg) count++;
            }
            double tmp = (double) count*100/N;
            String string = String.format("%.3f", tmp );

            answer.add(string+"%");
        }
        for(String tmp : answer) {
            System.out.println(tmp);
        }
        bf.close();
    }
}

