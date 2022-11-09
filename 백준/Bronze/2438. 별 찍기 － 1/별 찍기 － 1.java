import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
//        0 ~ 4 5번
        for (int i = 0; i < T; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                s.append("*");
            }
            System.out.println(s);
        }
    }
}
