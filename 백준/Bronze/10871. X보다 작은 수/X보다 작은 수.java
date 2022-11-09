import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] NX = scanner.nextLine().split(" ");
        int X = Integer.parseInt(NX[1]);
        String[] arr  = scanner.nextLine().split(" " );
        List<String> list = new ArrayList<>();
        scanner.close();
        for(String tmp : arr) {
            int lessThanX = Integer.parseInt(tmp);
            if(lessThanX < X) list.add(String.valueOf(lessThanX));
        }
        System.out.println( String.join(" ",  list))  ;

    }
}
