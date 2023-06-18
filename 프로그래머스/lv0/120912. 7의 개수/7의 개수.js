function solution(array) {
    let str = array.join("");
    const length = str.length;
    const regex = /[^7]/g;
    return str.replace(regex,"").length;
}