function solution(array) {
    var answer = 0;

    let mode = {};
    for(let i = 0; i < array.length; i++) {
         const num = array[i];
        mode[num] = mode[num] ? mode[num]+1 : 1;
    }
    const keys = Object.keys(mode);
    const values = Object.values(mode);
    // value중에 큰값 찾기 => 중복체크
    const maxValue = Math.max(...values);
    
    if(keys.length == 1) return array[0];
    if(values.indexOf(maxValue) != values.lastIndexOf(maxValue)) return -1;
    else return parseInt(keys[values.indexOf(maxValue)]);
    
}