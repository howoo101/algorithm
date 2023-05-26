function solution(rsp) {
    const wins = ["2","0","5","2"]
    return rsp.split("")
    .reduce((prev,curr) => prev + wins[wins.indexOf(curr)+1],"");
}