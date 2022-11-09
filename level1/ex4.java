package test;


import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import org.junit.platform.commons.util.CollectionUtils;

//이상한 문자 만들기
class ex4 {
	public static void main(String[] args) {
		
	}
	
	public String solution(String s) {
	      String answer = "";
		      String[] arr = s.split(" ",-1);
	            System.out.println(java.util.Arrays.toString(arr));
		      for(int i = 0; i < arr.length; i++) {
		        String[] tmp = arr[i].split("");
		        for(int j = 0; j < tmp.length; j++) {
	                if(j%2==0) tmp[j] = tmp[j].toUpperCase();
	                else tmp[j] = tmp[j].toLowerCase();
	            }
	              arr[i] = String.join("",tmp);
	          }
	      answer = String.join(" ",arr);
		      return answer;
	    }
}
