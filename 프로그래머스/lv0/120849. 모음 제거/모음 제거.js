function solution(my_string) {
    const m = ["a","e","i","o","u"];
    let answer = "";
    for(let s of my_string) {
        if(!m.includes(s)) answer += s;
    }
    return answer;
}