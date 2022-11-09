import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] arr = scanner.nextLine().split(" ");
            if(arr[0].equals("0") &&  arr[1].equals("0")) {
                break;
            }
            System.out.println(Integer.parseInt(arr[0])+ Integer.parseInt(arr[1]));
        }
    }
}
