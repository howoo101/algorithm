import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] arr  = scanner.nextLine().split(" " );

        int v = scanner.nextInt();
        scanner.close();
        int count = 0;
        for(String tmp : arr) {
            if(Integer.parseInt(tmp) == v) count++;
        }
        System.out.println(count);

    }
}
