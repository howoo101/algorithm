package twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공통원소구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] input1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();
        int M = Integer.parseInt(br.readLine());
        int[] input2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();
        System.out.println(Arrays.toString(new 공통원소구하기().solution(N,M,input1, input2))
                .replace("[", "").replace("]", "").replace(",", "")
        );

    }

    private int[] solution(int N, int M,int[] input1, int[] input2) {
        List<Integer> answer = new ArrayList<>();

        int pos1 = 0, pos2 = 0;
        while (pos1 <N && pos2 <M) {
            if(input1[pos1]==input2[pos2]){
                answer.add(input1[pos1]);
                pos1++;
                pos2++;
            }else if(input1[pos1] > input2[pos2]){
                pos2++;
            }else {
                pos1++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}