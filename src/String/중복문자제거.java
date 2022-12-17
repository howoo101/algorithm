package String;

import java.util.*;

public class 중복문자제거 {
    public String solution1(String input) {
        Set<Character> hashSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            hashSet.add(c);
        }
        char[] arr = new char[hashSet.size()];
        for (int i = 0; i < hashSet.toArray().length; i++) {
            arr[i] = (char) hashSet.toArray()[i];
        }
        return String.valueOf(arr);
    }

    public String solution2(String input) {
        char[] chars = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(i+" " + chars[i]+ " " +input.indexOf(chars[i]));
            if(i == input.indexOf(chars[i])) builder.append(chars[i]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(new 중복문자제거().solution2(input1));
    }
}