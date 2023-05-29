function solution(sides) {
    sides.sort((a,b) => b-a);
    console.log(sides);
    return sides.reduce((acc,curr)=> acc-curr) >= 0 ? 2 : 1;
}