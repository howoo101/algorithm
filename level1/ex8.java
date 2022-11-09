package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class ex7 {
//자리수 더하기
	public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        for(int i = 0; i < a.length(); i++) {
            answer += n%10;
            n /=10;
        }	

}
