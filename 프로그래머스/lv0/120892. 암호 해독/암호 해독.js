function solution(cipher, code) {
    let answer = '';
    
    return [...cipher].filter((el,idx) => {
        return idx%code == code-1
    }).join("");
}