import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        StringBuilder s = new StringBuilder();
        for(char i = 'a'; i <= 'z'; i++) {
            s.append(S.indexOf(Character.toString(i)));
            s.append(" ");
        }
        System.out.println(s.toString());
    }

}
