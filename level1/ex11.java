//자연수 뒤집어 배열로 만들기
class Solution {
  public int[] solution(long n) {
      int[] answer = {};
      String a = String.valueOf(n);
      String[] arr = a.split("");
      answer = new int[arr.length];
      for(int i = 0; i < arr.length; i++) {
          answer[i] = Integer.parseInt(arr[arr.length-1-i]);
      }
      return answer;
  }
}