package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//나누어 떨어지는 숫자 배열
class test {
	public static void main(String[] args) {
		System.out.println( solution(118372)  );
	}
	public static long solution(long n) {
	      long answer = 0;
	      String a = String.valueOf(n);
	      String[] arr = a.split("");
	      List<String> list = Arrays.asList(arr);
	      Collections.sort(list);
	      Collections.reverse(list);
	      answer = Long.parseLong(String.join("", list));
	      return answer;
	  }       
}
