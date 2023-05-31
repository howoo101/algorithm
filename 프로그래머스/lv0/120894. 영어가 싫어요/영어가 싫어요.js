function solution(numbers) {
    const eng = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" ];
    const num = eng.map((_,idx) => idx);
    
    for(let i = 0; i < eng.length; i++) {
        numbers = numbers.replaceAll(eng[i],num[i]);
    }
    
                 
    return parseInt(numbers);
}