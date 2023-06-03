function solution(n) {
    const answer = String(n).split("").reduce((acc,curr) =>parseInt(acc)+parseInt(curr),0);
    return answer;
}