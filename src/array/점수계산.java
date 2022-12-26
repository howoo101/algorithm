package array;

import java.util.Scanner;
  
public class 점수계산 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int N = in.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] =  in.nextInt();
    }
    System.out.println(new 점수계산().solution(arr));

  }

  private int solution(int[] arr) {
    int answer = 0;
    int point = 0;
    for (int tmp : arr) {
      if(tmp == 1) answer += ++point;
      else point = 0;
    }
    return answer;
  }
}