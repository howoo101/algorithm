function solution(my_string) {
    let arr = my_string.split(" ");
    let answer = 0;
    let op = ""
    for (let tmp of arr) {
      if(isNaN(tmp)) op = tmp;
      else answer += parseInt(op+tmp);
    }
        
    return answer;
}