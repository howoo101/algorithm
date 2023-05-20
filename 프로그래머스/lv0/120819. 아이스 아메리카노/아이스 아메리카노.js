function solution(money) {
    var answer = [];
    const americano = 5500;
    answer.push(parseInt(money/americano));
    answer.push(money%americano);
    return answer;
}