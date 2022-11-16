import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();
        S = S.toUpperCase();
//        System.out.println("S = " + S);
        char[] chars = S.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char tmp:chars) {
            //key 널체크와 동시에 있으면 기존값에 더해줌
            map.merge(tmp, 1, (a, b) -> (Integer) a + b);
        }
//        System.out.println(map.keySet());
//        System.out.println(map.values());
        int max = 0;
        char character = 0;
        for (char key:map.keySet()) {
            int tmp  = map.get(key);
            if(max < tmp) {
                max = tmp;
                character = key;
            }
        }
        for (char key:map.keySet()) {
            if(key == character) continue;

            int tmp  = map.get(key);
            if(max == tmp) {
                character = '?';
            }
        }
        System.out.println(character);
    }
}
