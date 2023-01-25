import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrSize = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] a = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(new Main().solution(a,b).toString()
                .replace("[","").replace("]","")
                .replace(",","")
        );


    }

    public ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
        for (int i : b) {
            list.add(i);
        }
        list.sort(Integer::compareTo);
        return list;
    }
}
