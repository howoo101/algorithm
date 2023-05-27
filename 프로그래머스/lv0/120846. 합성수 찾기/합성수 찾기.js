function solution(n) {
    let answer = 0;
    for(let i = 1; i <=n; i++) {
        let count = getCount(i);
        if(count > 2) answer++;
    }
    return answer;
}

//약수 개수 구하는 함수
function getCount(n) {
    let count = 2;
    for(let i = 2; i <= Math.sqrt(n); i++) {
        if(n%i == 0) count+=2;
        if(i == Math.sqrt(n)) count--;
    }
    return count;    
}
