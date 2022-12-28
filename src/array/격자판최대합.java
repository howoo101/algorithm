package array;

import java.util.Scanner;
  
public class 격자판최대합 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int N = in.nextInt();
    int[][] arrs = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        arrs[i][j] = in.nextInt();
      }
    }
    System.out.println(new 격자판최대합().solution(N, arrs));
    System.out.println(new 격자판최대합().solution2(N, arrs));
  }

  private int solution(int N, int[][] arrs) {
    int max1 = 0;
    int max2;

    int crossSum1 = 0;
    int crossSum2 = 0;
    for (int i = 0; i < N; i++) {
      int rowSum = 0;
      int colSum = 0;
      for (int j = 0; j < N; j++) {
        rowSum += arrs[i][j];
        colSum += arrs[j][i];
        if(i == j) crossSum1 += arrs[i][j];
        if(i + j == N-1) crossSum2 += arrs[i][j];
      }
      max1 = Integer.max(max1,Integer.max(rowSum, colSum));
    }
    max2 = Integer.max(crossSum1, crossSum2);
    return Integer.max(max1, max2);
  }

  private int solution2(int N, int[][] arrs) {
    int answer = Integer.MIN_VALUE;
    int sum1; //행
    int sum2; //열

    for (int i = 0; i < N; i++) {
      sum1 = sum2 = 0;
      for (int j = 0; j < N; j++) {
        sum1 += arrs[i][j];
        sum2 += arrs[j][i];
      }
      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);
    }
    sum1 = sum2 = 0;
    for (int i = 0; i < N; i++) {
      sum1 += arrs[i][i];
      sum2 += arrs[i][N - 1 - i];
    }
    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);
    return answer;
  }
}