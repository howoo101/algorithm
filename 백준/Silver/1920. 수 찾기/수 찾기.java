import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st2.hasMoreTokens()) {
            list.add(Integer.parseInt(st2.nextToken()));
        }
        Collections.sort(list);
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st3.nextToken());
        List<Integer> list2 = new ArrayList<>();
        StringTokenizer st4 = new StringTokenizer(br.readLine());
        while (st4.hasMoreTokens()) {
            list2.add(Integer.parseInt(st4.nextToken()));
        }
        for (Integer integer : list2) {
            int idx = Collections.binarySearch(list, integer);
            System.out.println(idx >=0 ? 1 :0);
        }

    }
}