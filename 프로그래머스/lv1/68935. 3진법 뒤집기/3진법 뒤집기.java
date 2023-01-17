import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int solution(int n) {
        String tenToThree = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(tenToThree);
        String reverse = sb.reverse().toString();
        return Integer.parseInt(reverse, 3);
    }
}