import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numArray = s.split(" ");
        int[] intArray = new int[numArray.length];

        Arrays.sort(numArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        for (int i = 0; i<numArray.length; i++){
            intArray[i] = Integer.parseInt(numArray[i]);
        }
        //Arrays.sort(intArray);

        int min = intArray[0];
        int max = intArray[intArray.length-1];

        answer = min+" "+max;
        return answer;
    }
}