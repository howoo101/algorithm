var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split('\n');
var T = parseInt(input[0]);
for (var i = 1; i <= T; i++) {
    var arr = input[i].split(' ');
    var sum = parseInt(arr[0]) + parseInt(arr[1]);
    console.log("Case #"+i+": "+sum);
}