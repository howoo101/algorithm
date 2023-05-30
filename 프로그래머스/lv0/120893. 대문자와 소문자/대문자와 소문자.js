function solution(my_string) {
    let answer = '';
    for(let letter of my_string) {
        if(letter.match("[a-z]") != null) {
            answer += letter.toUpperCase();
            continue;
        }
        if(letter.match("[A-Z]") != null) {
            answer += letter.toLowerCase();
        }
    }
    return answer;
}