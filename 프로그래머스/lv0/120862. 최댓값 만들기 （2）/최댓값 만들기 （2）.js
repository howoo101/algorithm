function solution(numbers) {
    let answer = 0;
    numbers.sort((a,b) => a-b);
    
    return numbers.length === 2 ? numbers[0] * numbers[1] : Math.max((numbers[0]*numbers[1]),
              (numbers[numbers.length-1]*numbers[numbers.length-2])
             )
}