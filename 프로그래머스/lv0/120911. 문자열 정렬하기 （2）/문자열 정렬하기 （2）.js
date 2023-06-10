function solution(my_string) {
    var answer = [...my_string].map(el => el.toLowerCase())
                               .sort().join("");
    return answer;
}