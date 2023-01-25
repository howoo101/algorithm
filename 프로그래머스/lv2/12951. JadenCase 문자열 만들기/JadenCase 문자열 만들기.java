import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
      public String solution(String s) {
      String[] words = s.split(" ",-1);
      words = Arrays.stream(words)
                    .map(word -> word.length() > 1
                        ? word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()
                        : word.toUpperCase())
                    .toArray(String[]::new);

        return String.join(" ", words);

    }
}