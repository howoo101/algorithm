function solution(my_string) {
    let answer = '';
    for(let letter of my_string) {
       if(letter === letter.toLowerCase()) {
           answer += letter.toUpperCase();
       }else {
           answer += letter.toLowerCase();
       }
    }
    return answer;
}