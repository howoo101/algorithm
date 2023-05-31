function solution(n) {
    var answer = [1,n];
    for(let i = 2; i <= Math.sqrt(n); i++) {
        if(n%i== 0) {
            answer.push(i);
            answer.push(n/i);
        }
    }
    answer.sort((a,b) => a-b);
    return [...new Set(answer)];
}