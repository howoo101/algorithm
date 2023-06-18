function solution(array, n) {
    var answer = array.filter(idx=> idx===n).length;
    return answer;
}