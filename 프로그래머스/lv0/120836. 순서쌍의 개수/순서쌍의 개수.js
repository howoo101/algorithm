function solution(n) {
    let answer = 0;
    let isSqrt = false;
    
    for(let i = 1; i <= Math.sqrt(n); i++) {
        if(n%i == 0) answer++;
        if(i == Math.sqrt(n)) isSqrt = true;
    }
    return isSqrt ? answer*2 -1: answer*2;
}