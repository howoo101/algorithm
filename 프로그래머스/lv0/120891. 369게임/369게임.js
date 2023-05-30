function solution(order) {
    var answer = 0;
    
    return new String(order).replace(/[^369]/g,"").length;
}