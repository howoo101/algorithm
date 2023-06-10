function solution(n, t) {
    const answer = Array(t).fill(2)
                           .reduce((acc,curr) => acc*curr,n)
                           // .join("");
    return answer;
}