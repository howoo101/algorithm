import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        ArrayList<Integer> list = new ArrayList<>();

        String[] input = br.readLine().split(" ");
        for (String value : input) {
            int tmp = Integer.parseInt(value);
            list.add(tmp);
        }
        Collections.sort(list);
        for (int food : list) {
            if (K >= food) K++;
        }

        System.out.println(K);
    }
}
