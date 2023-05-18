function solution(array) {
    var answer = 0;
    array = array.sort((a,b)=>a-b);
    const center = Math.floor(array.length/2);
    console.log(array);
    return array[center];
}