import java.util.Scanner;
class Solution {
    public boolean isPalindrome(String s) {
       
        final String ONLY_REGIX = "[^a-z0-9A-Z]";
        s = s.replaceAll(ONLY_REGIX, "").toLowerCase();
        boolean answer = true;
        System.out.println(s.length());
        for (int i = 0; i < s.length()/2; i++) {
            int reverseCnt = s.length() - 1 - i;
            if(s.charAt(i) != s.charAt(reverseCnt)){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
    
    
}