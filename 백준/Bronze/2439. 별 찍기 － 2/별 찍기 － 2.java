import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
//        0 ~ 4 5번
        for(int i = 0; i < T; i++) {
            StringBuilder s =  new StringBuilder();
            for(int j = 1; j <= T; j++) {
                if(j >= T-i) s.append("*");
                else s.append(" ");
            }
            System.out.println(s);
        }
    }
}
