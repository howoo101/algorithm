import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String answer = "";
        for (char tmp : S.toCharArray()) {
            if(Character.isLowerCase(tmp)) answer += Character.toUpperCase(tmp);
            else answer += Character.toLowerCase(tmp);
        }
        System.out.println(answer);

    }

}
