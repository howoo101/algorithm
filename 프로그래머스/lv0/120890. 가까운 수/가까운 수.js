function solution(array, n) {
    array.sort((a,b) => a-b);
    const nearArr = array.map(el => Math.abs(el-n));
    const min = Math.min(...nearArr);
    
    return array[nearArr.indexOf(min)];
}