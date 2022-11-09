package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import org.junit.platform.commons.util.CollectionUtils;

//약수의 합
class ex5{
	public static void main(String[] args) {
		System.out.println(solution(12));
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i=1; i < Math.sqrt(n); i++) {
			if(n%i==0) {
				int mok = n/i;
				answer += (i + mok);
			}
		}
		return answer;
	}
}
