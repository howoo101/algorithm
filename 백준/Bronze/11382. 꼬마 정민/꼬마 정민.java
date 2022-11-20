import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
        long sum = 0;
        while (st.hasMoreTokens()) {
            sum += Long.parseLong(st.nextToken());
        }
        System.out.println(sum);

    }

}
