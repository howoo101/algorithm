package Array;

import java.util.ArrayList;
import java.util.List;

public class Main_4673 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            list2.add(i);
            int tmp = i;
            int sum = i;
            while (tmp > 0) {
                sum += (tmp % 10);
                tmp /= 10;
            }
            if(sum <=10000)
                list.add(sum);
        }
        list2.removeAll(list);
        for(int tmp : list2) {
            System.out.println(tmp);
        }
    }
}
