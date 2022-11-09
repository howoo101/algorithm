import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int max = scanner.nextInt();
        int[] arr = new int[31];
        for(int i = 0; i <31; i++) {
            arr[i] = i;
        }
        for(int i = 0; i <28; i++) {
            int tmp = scanner.nextInt();
            arr[tmp] = 0;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 1; i <31; i++) {
            if(count == 2) break;
            if(arr[i] != 0){
                sb.append(i+" ");
                count++;
            }
        }
        int tmp1 = Integer.parseInt(sb.toString().split(" ")[0]);
        int tmp2 = Integer.parseInt(sb.toString().split(" ")[1]);
        if(tmp1 > tmp2) {
            System.out.println(tmp2);
            System.out.println(tmp1);
        }else {
            System.out.println(tmp1);
            System.out.println(tmp2);
        }

    }
}
