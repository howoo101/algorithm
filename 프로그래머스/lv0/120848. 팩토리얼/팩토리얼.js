function solution(n) {
    let answer = 1;
    while (Math.floor(n/=answer) != 0) answer++;
    return answer-1;
}

// 1 : 20
// 2 : 10
// 3 : 3.