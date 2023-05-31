function solution(s) {
    let answer = [];
    let map = new Map();
    for (letter of [...s]) {
        if(map.has(letter)) {
            map.set(letter,map.get(letter) +1)
        }else {
            map.set(letter,1);
        }
    }
    for ([key,value] of map) {
        if(value == 1) answer.push(key);
    }
    return answer.sort().join("");
    
    
    
           
    
    
}