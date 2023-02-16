import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp <= K) stack.push(tmp);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int money = stack.pop();
            int mok = K / money;
            answer += mok;
            if(K==0) break;
            K -= money * mok;
        }

        System.out.println(answer);
    }
}
