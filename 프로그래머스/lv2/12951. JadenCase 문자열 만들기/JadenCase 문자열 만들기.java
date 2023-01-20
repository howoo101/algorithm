import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
        public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(s," ",true);
        while (stringTokenizer.hasMoreTokens()) {
            String s1 = stringTokenizer.nextToken();

            char c = s1.charAt(0);
            if(Character.isDigit(c)) {
                sb.append(c);
            }else if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(c);
            }
            sb.append(s1.substring(1).toLowerCase());

        }
        return sb.toString();
    }
}