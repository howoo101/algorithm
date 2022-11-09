var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split('\n');
var T = parseInt(input[0]);
for (var i = 1; i <= T; i++){
    var tmpArr = input[i].split(' ');
    console.log(parseInt(tmpArr[0]) + parseInt(tmpArr[1]));
}