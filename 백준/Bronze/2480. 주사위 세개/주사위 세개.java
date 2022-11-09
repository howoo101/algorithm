import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
         코드가 너무 별로야
         단순하고 효율적으로 풀어
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        scanner.close();

        Map<Integer, Integer> map = new HashMap<>();

        for (String tmp : arr) {
            if(map.containsKey(Integer.parseInt(tmp))) {
                map.put(Integer.parseInt(tmp),(int)map.get(Integer.parseInt(tmp))+1);
            }
            else map.put(Integer.parseInt(tmp), 1);

        }
        int maxKey = Collections.max(map.keySet());
        int maxValue =  Collections.max(map.values());
        int repeat = 0;
        for(int tmp : map.keySet()) {
            if(map.get(tmp) == maxValue) {
                repeat = tmp;
                break;
            }
        }
        if(maxValue == 3) {
            System.out.println(10000 + repeat*1000);
        }else if (maxValue == 2) {
            System.out.println(1000 + repeat*100);
        }else {
            System.out.println(maxKey * 100);
        }
    }
}
