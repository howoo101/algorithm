function solution(quiz) {
    let result = [];
    
    for(let tmps of quiz) {
    
        let arr = tmps.split("=");
        
        let ex = arr[0];
        let answer = parseInt(arr[1]);
        
        let acc = 1;
        let tmp = 0;
        
        const arr2 = ex.split(" ");
        for(let i = 0; i< arr2.length; i++) {
            if(Number(arr2[i])) tmp += (Number(acc*arr2[i]));
            else arr2[i] === '+' ? (arr = 1): (acc = -1);
        }
        console.log(tmp);
        tmp === answer ? result.push("O") : result.push("X");
        
    }
    
    return result;
}