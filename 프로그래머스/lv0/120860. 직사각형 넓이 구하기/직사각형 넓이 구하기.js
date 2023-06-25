function solution(dots) {
    dots.sort();
    const width = Math.abs(dots[0][0] - dots[3][0]);
    const height = Math.abs(dots[0][1] - dots[3][1]);
    
    return width * height;
}