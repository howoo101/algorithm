function solution(numbers, k) {
    let answer = 1;
    
    let count = 1;
    for(let i = 0; ; i+=2) {
        i %= numbers.length;
        if(count == k) return numbers[i];
        count++;
    }
    
    return answer;
}