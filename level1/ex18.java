//최대공약수와 최소공배수
class Solution {
  public int[] solution(int n, int m) {
      int[] answer = new int[2];
	      int max = Math.max(n,	m);
	      int min = Math.min(n, m);
	      int mok = 0;
	      int na = 0;
	      
	      do {
	    	  mok = max / min;
	    	  na = max % min; 
	    	  if(na != 0) {
	    		  max = min;
		    	  min = na;   
	    	  }
	      }while(na != 0);
	      
	      answer[0] = min;
	      answer[1] = n * m / min;
	    		  
	      return answer;
  }
}