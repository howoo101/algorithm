package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//정수 제곱근 배열
class Solution {
  public long solution(long n) {
       long answer = -1;
		double tmp = Math.sqrt(n);
	  if (tmp %1 == 0)	
        answer = (long) Math.pow(tmp+1,2);
		
		
		return answer;
  }
}