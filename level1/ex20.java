import java.util.ArrayList;
//level1 모의고사
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] tmp = {0,0,0};
        int[] num1 = {1,2,3,4,5}; //5
        int[] num2 = {2,1,2,3,2,4,2,5}; //8
        int[] num3 = {3,3,1,1,2,2,4,4,5,5}; //10
        int count = 0;
        for(int i = 0, k = 0, j = 0, l = 0; i < answers.length; i++, k++,j++,l++) {
        	if(k == 5) k = 0;
            if(j == 8) j = 0;
            if(l == 10) l = 0;
        	if(answers[i] == num1[k]) tmp[0]++;
        	if(answers[i] == num2[j]) tmp[1]++;
        	if(answers[i] == num3[l]) tmp[2]++;
        }
        ArrayList a = new ArrayList();
        
        int max = tmp[0];
        a.add(1);
        for(int i = 1; i < tmp.length; i++) {
        	if(max < tmp[i]) {
        		max = tmp[i];
        		a.removeAll(a);
        		a.add(i+1);
        	}
        	else if(max == tmp[i]) {
        		a.add(i+1);
        	}
        }
        answer = new int[a.size()];
        for(int i = 0; i < a.size(); i++) {
        	answer[i] = (int)a.get(i);
        }
        return answer;
    }
}