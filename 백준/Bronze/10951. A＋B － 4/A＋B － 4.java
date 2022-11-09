import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] arr = scanner.nextLine().split(" ");
            
            System.out.println(Integer.parseInt(arr[0])+ Integer.parseInt(arr[1]));
        }
    }
}
