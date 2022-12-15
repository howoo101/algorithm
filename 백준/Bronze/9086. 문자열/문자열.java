import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            String sb = s.charAt(0) +
                    String.valueOf(s.charAt(s.length() - 1));
            System.out.println(sb);
        }


    }

}
