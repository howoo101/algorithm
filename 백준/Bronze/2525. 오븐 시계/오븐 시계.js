var fs = require('fs');
var input = fs.readFileSync('/dev/stdin').toString().split('\n');
var arr = input[0].split(' ');

var hour = parseInt(arr[0]);
var minute = parseInt(arr[1]);
var time = parseInt(input[1]);

var plusHour= parseInt((minute + time)/ 60);
minute = (minute + time)% 60;
var totalHour = hour+plusHour;
if(totalHour == 24) {
    hour = 0;
}else if (totalHour < 24){
    hour += plusHour;
}else {
    hour+= plusHour-24;
}
      
console.log(hour + " " + minute);

