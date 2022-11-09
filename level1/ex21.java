import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//lv1 문자열 내 마음대로 정렬하기
class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = {};
		List aList = Arrays.asList(strings);
		Collections.sort(aList, (c,d)-> {
			return ((String)c).charAt(n) == ((String)d).charAt(n) ?
					((String)c).compareTo((String)d) 
					:((String)c).charAt(n) > ((String)d).charAt(n) ? 1 : -1;
			});
      
      answer = (String[]) aList.toArray(new String[aList.size()]);
      return answer;
  }
}