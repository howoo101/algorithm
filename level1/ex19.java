import java.util.HashMap;

//문자열 내 p와 y의 개수
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	char tmp = s.charAt(i);
        	tmp = Character.toUpperCase(tmp);
	        if(map.get(tmp) == null) map.put(tmp,1);
	        else {
	        	map.replace(tmp, map.get(tmp)+1);
	        }
        }
        answer = map.get('P')==map.get('Y');
        return answer;
    }
}