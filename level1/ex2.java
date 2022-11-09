import java.util.*;
class Solution {
  public String solution(String s) {
      String answer = "";
      MyComparator a = new MyComparator();
      String[] arr = s.split("");
      java.util.Arrays.sort(arr,a);
      answer = String.join("",arr);
      return answer;
  }
    
    class MyComparator implements Comparator<String> {
        public int compare (String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}