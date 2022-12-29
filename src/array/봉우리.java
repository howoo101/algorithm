package array;

import java.util.Arrays;
import java.util.Scanner;

public class 봉우리 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arrs = new int[N+2][N+2];
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                arrs[i][j]= in.nextInt();
            }
        }
        System.out.println(new 봉우리().solution(N,arrs));
    }

    private int solution(int N,int[][] arrs) {
        int answer = 0;
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                int num = arrs[i][j];
                int west = arrs[i][j - 1];
                int east = arrs[i][j + 1];
                int north = arrs[i - 1][j];
                int south = arrs[i + 1][j];
                if(num >west && num > east && num>north && num>south ) answer++;
            }
        }
        return answer;
    }

    private int solution2(int N,int[][] arr) {
        int answer = 0;
        //상 우 하 좌
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx < N&& ny>=0 && ny< N && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void printArray2d(int[][] arrs) {
        for (int[] arr: arrs) {
            System.out.println("arr = " + Arrays.toString(arr));

        }
    }
}