import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < N; i++) {
            StringBuilder s = new StringBuilder();
            String[] arr = scanner.nextLine().split(" ");
            int R = Integer.parseInt(arr[0]);
            String S = arr[1];
            for (char tmp: S.toCharArray()) {
                for (int j = 0; j <R ; j++) {
                    s.append(Character.toString(tmp));
                }
            }
            System.out.println(s.toString());
        }
    }

}
