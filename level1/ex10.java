package test;

import java.util.ArrayList;
import java.util.Collections;

//나누어 떨어지는 숫자 배열
class test {
	public static void main(String[] args) {
		System.out.println(  );
	}
	public int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      ArrayList<Integer> a = new ArrayList<>();
	      for(int i = 0; i < arr.length; i++) {
	    	  if(arr[i]%divisor == 0) {
	    		  a.add(arr[i]);
	    	  }
	      }
	      Collections.sort(a);
	      answer = new int[a.size()];
	      for(int i = 0; i < a.size(); i++) {
	    	  answer[i] = a.get(i);
	      }
	      return answer;
	  }       
}
