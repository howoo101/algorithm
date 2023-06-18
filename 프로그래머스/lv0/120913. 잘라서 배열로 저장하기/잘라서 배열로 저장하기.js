function solution(my_str, n) {
    let answer = [];
    while(my_str.length>n) {
        answer.push(my_str.substr(0,n));
        my_str = my_str.substr(n);
    }
    answer.push(my_str.substr(0,n));
    return answer;
}