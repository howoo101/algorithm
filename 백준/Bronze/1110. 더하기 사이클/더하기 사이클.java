import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int original = T;
        int count = 0;
        do {
            int a = T / 10;
            int b = T % 10;
            int sum = a + b;
            T = b * 10 + sum % 10;
            count++;

        } while (T != original);
        System.out.println(count);
    }
}
