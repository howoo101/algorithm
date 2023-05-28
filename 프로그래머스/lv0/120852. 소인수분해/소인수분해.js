function solution(n) {
    var answer = new Set();
    let measure = 2;
    while(n != 1) {
        if(n % measure == 0) {
            n /= measure;
            answer.add(measure);
        }else {
            measure++;
        }
    }
    return [...answer];
}