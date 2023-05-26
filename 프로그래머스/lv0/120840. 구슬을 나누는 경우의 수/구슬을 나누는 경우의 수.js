function solution(balls, share) {
    var answer = factorial(balls)/(factorial(balls-share)*factorial(share));
    
    return Math.round(answer);
}

function factorial(n) {
    let answer = 1;
    for(let i = 2; i <= n; i++) {
        answer *= i;
    }
    return answer;
}