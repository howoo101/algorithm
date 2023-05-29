function solution(s) {
    let answer = 0;
    const arr = s.split(" ");
    let before = 0;
    for (let letter of arr) {
        if(isNaN(letter)) answer -= before;
        else {
            letter = parseInt(letter);
            answer +=  letter;
            before = letter;
        }
    }
    return answer;
}