package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//핸드폰 번호 가리기
class ex7 {
	public static void main(String[] args) {
		System.out.println("*******4444");
		System.out.println( solution("01033334444") );
	}
	public static String solution(String phone_number) {
	      String answer = "";
	      
	      for(int i = 0; i <phone_number.length()-4; i++) {
	    	  answer += "*";
	      }
	      return answer+phone_number.substring(phone_number.length()-4);
	  }
	

}
