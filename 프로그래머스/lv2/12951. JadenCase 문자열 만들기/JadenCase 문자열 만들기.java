import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
     public String solution(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
            while (stringTokenizer.hasMoreTokens()) {
                String s1 = stringTokenizer.nextToken();
                char c = s1.charAt(0);
                if(Character.isUpperCase(c)) sb.append(c);
                else sb.append(Character.toUpperCase(c));
                sb.append(s1.substring(1).toLowerCase());
            }
        return sb.toString();
    }
}