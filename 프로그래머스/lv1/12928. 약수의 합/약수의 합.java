class Solution {
  public int solution(int n) {
      int answer = 0;
      // 1 3 9
          
      for(int i=1; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				int mok = n/i;
                if(mok == i) mok = 0;
				answer += (i + mok);
			}
		}
      return answer;
  }
}