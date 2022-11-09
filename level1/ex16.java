//x만큼 간격이 있는 n개의 숫자

class Solution {
  public long[] solution(long x, int n) {
      long[] answer = {};
      answer = new long[n];
      long tmp = x;
      for(int i = 0; i < answer.length; i++) {
          answer[i] = tmp;
          tmp += x;
      }
      return answer;
  }
}