//2016년
class Solution {
    //2월 29일까지 있음 
  public String solution(int a, int b) {
      String answer = "THU";
      int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
      String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
      int days = 0;
      for(int i =0; i < a-1; i++) {
          days += month[i];
      }
      days += b;
      
      int res = days%7;
      if(res != 0)
        answer = day[res];
      
      return answer;
  }
}