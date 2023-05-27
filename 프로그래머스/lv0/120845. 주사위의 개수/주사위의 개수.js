function solution(box, n) {
    
    const answer = box.map(el => parseInt(el /= n))
    .reduce((acc,curr) => acc * curr);
    
    return answer;
}