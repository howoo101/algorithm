import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st1.hasMoreTokens()) {
            list.add(Integer.parseInt(st1.nextToken()));
        }
        Collections.sort(list);
        int M = Integer.parseInt(br.readLine());
        List<Integer> list2 = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        while (st2.hasMoreTokens()) {
            list2.add(Integer.parseInt(st2.nextToken()));
        }

        for (Integer integer : list2) {
            int idx = Collections.binarySearch(list, integer);
            System.out.println(idx >=0 ? 1 :0);
        }

    }
}