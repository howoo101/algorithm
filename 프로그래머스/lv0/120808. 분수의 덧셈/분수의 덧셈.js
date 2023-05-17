function solution(numer1, denom1, numer2, denom2) {
    let answer = [];
    
    let num1 = (numer1 * denom2) + (numer2 * denom1);
    let num2 = denom1 * denom2; 
    
    const min = Math.min(num1,num2);
    let gcd = 1;

    
    for(let i = 2; i <= min; i++) {
        if(num1 %i ==0 & num2 %i ==0) {
            gcd = i;
        }
    }
    
    
    if(gcd >=2) {
        if(num1 % gcd == 0)
            num1 /= gcd;
        if(num2 % gcd == 0)
            num2 /= gcd;
    }
    
    answer.push(num1);
    answer.push(num2);
    
    return answer;
}