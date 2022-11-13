var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split('\n');
var sum = 0;
var a = parseInt(input[0]);
var b = input[1].split('');
for(var i = 0; i<a; i++) {
    sum += parseInt(b[i]);
}
console.log(sum);