package array;

import java.util.Scanner;
  
public class 등수구하기 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] arrs = new int[N];

    for (int i = 0; i < N; i++) {
        arrs[i] = in.nextInt();
    }
    for (int i = 0; i < N; i++) {
      System.out.print( new 등수구하기().solution(i,N,arrs) +" ");
    }

    for(int answer : new 등수구하기().solution2(N,arrs)) System.out.print(answer + " ");
  }

  private int solution(int idx,int N, int[] arrs) {
    int answer = 0 ;
      int ranking = N;
      for(int j = idx+1; j < N; j++) {
        if(arrs[idx] >= arrs[j]) ranking--;
      }
      for(int k = idx-1; k >= 0; k--) {
        if(arrs[idx] >= arrs[k]) ranking--;
      }
      answer = ranking;
      return answer;
    }
    private int[] solution2 (int N,int[] arr) {
      int[] answer = new int[N];
      for(int i = 0; i < N; i++) {
        int rank = 1;
        for(int j = 0; j < N; j++) {
          if(arr[j] > arr[i]) rank++;
        }
        answer[i] = rank;
      }
      return answer;
    }
}