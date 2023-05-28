function solution(my_string) {
    const answer = my_string.replace(/[a-z]/g,"")
    .split("")
    .sort((a,b) => a-b)
    .map(el => parseInt(el))
    return answer;
}