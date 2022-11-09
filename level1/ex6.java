package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//체육복
class ex6 {
	public static void main(String[] args) {
		System.out.println(solution(5,new int[] {2, 4},new int[] {1,3,5}));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(lost[i]==reserve[j]) { //잃어버린게 아니야 
        			reserve[j] = -2;
                    lost[i] = 0;
        			break;
        		}
        	}
        }
        
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(reserve[j]-1 == lost[i]) {
        			reserve[j] = -2;
        			lost[i] = 0;
        			break;
        		}
                if(reserve[j]+1 == lost[i]) {
                    reserve[j] = -2;
                    lost[i] = 0;
                    break;
                }
        	}
        }
        
        for(int i = 0; i < lost.length; i++) {
            if(lost[i] == 0) answer++;
        }
        return answer;
    }
}
