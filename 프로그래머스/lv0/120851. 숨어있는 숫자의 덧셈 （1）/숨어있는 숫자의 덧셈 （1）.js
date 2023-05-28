function solution(my_string) {
    let answer="";
    answer = my_string.replace(/[^0-9]/g,"")
    .split("")
    .reduce((acc,curr) => parseInt(acc)+parseInt(curr));
    
    return answer;
}