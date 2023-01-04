package twoPointer_slidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 두배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        int[] arr2 = new 두배열합치기().solution2(N, M, s1, s2);
        System.out.println(Arrays.toString(arr2)
                .replace(",", "").replace("[", "").replace("]", ""));
    }

    private int[] solution2(int N, int M, String[] s1, String[] s2) {
        int[] answer = new int[N + M];
        int[] arr1 = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();

        int p1 = 0, p2 = 0, pos = 0;
        while (p1 <N && p2 <M) {
            if (arr1[p1] < arr2[p2]) {
                answer[pos] = arr1[p1++];
            } else {
                answer[pos] = arr2[p2++];
            }
            pos++;
        }
        if (N > M) {
            for (int i = p1; i < arr1.length; i++) {
                answer[pos++] = arr1[i];
            }
        } else {
            for (int i = p2; i < arr2.length; i++) {
                answer[pos++] = arr2[i];
            }
        }
        return answer;
    }

    private int[] solution(int N, int M, String[] s1, String[] s2) {
        List<Integer> answer = new ArrayList<>();
        int[] objects = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
        int[] objects1 = Arrays.stream(s2).mapToInt(Integer::parseInt).toArray();


        for (Integer object : objects) {
            answer.add(object);
        }
        for (Integer object : objects1) {
            answer.add(object);
        }
        int[] arr = answer.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);

        return arr;
    }

}
