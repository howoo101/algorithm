import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int k = 0; k < N; k++) {
            int sum = 0;
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'O') {
                    sum += 1;
                    int tmp = 1;
                    for (int j = i + 1; j < chars.length; j++) {
                        if (chars[i] == chars[j]) {
                            sum += ++tmp;
                            i = j;
                        } else {
                            i = j;
                            break;
                        }
                    }
                }

            }
            System.out.println(sum);
        }
    }
}
