import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        ArrayList<Integer> list = new ArrayList<>();

        String[] spentTime = br.readLine().split(" ");
        for (String value : spentTime) {
            int tmp = Integer.parseInt(value);
            list.add(tmp);
        }
        Collections.sort(list);
        int totalTime = 0;
        int prev = 0;
        for (Integer time : list) {
            totalTime += time;
            prev += totalTime;
        }

        System.out.println(prev);
    }
}
