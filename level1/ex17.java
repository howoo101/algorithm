import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//제일 작은 수 제거하기
class Solution {
  public int[] solution(int[] arr) {
      int[] answer = {-1};
	      List list = new ArrayList<>();
	      for(int tmp : arr) {
	    	  list.add(tmp);
	      }
	      // Collections.sort(list, (a,b) -> { return (int)b-(int)a; });
	      
	      if(arr.length != 1) {
	    	  answer = new int[arr.length-1];
              int min = (int)list.get(0);
              int idx = 0;
              for(int i = 0; i < list.size(); i++) {
                  if (min > (int)list.get(i)) {
                      min = (int)list.get(i);
                      idx = i;
                  }
              }
              list.remove(idx);
	    	  for(int i = 0; i < answer.length; i++) {
		    	  answer[i] = (int)list.get(i);
		      }
	      }
	      
	      return answer;
  }
}