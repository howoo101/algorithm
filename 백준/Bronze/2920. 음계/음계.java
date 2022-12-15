import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] arrInt = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        int tmp = arrInt[0];
        String result = "";
        int count = 0;
        for (int j : arrInt) {
            if(count==0) {
                count++;
                continue;
            }
            if (tmp - j == 1) result = "descending";
            else if (tmp - j == -1) result = "ascending";
            else {
                result = "mixed";
                break;
            }
            tmp = j;
        }
        System.out.println(result);
    }

}
