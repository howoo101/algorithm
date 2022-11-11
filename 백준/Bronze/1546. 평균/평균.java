import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int MAX = Integer.MIN_VALUE;
        String[] arr = scanner.nextLine().split(" ");
        int sum = 0;
        for(String tmp : arr) {
            if(MAX<Integer.parseInt(tmp)) MAX = Integer.parseInt(tmp);
            sum += Integer.parseInt(tmp);
        }
        System.out.println((double) sum/MAX*100/N);


    }
}
