package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 보이는학생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(br.readLine());

        String[] input2 = br.readLine().split(" ");
        System.out.println(new 보이는학생().solution(input1, input2));
    }

    private int solution(int input1, String[] input2) {
        int max = Integer.parseInt(input2[0]);
        int answer = 1;
        for (int i = 1; i < input1; i++) {
            if(max < Integer.parseInt(input2[i])) {
              max = Integer.parseInt(input2[i]);
              answer++;
            }

        }
      return answer;
    }
}