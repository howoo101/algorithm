function solution(num_list) {
    let reversed = [];
    for (num of num_list) {
        reversed.unshift(num);
    }
    return reversed;
}