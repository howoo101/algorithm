days = input().split()
month = int(days[0])
date = int(days[1])
res = 0
months = [31,28,31,30,31,30,31,31,30,31,30,31]
if month != 1:
    for i in range(0,month-1):
        mDay = int(months[i])
        res += mDay
res += date

rem = res%7
if rem == 1:
    day = 'MON'
elif rem == 2:
    day = 'TUE'
elif rem == 3:
    day = 'WED'
elif rem == 4:
    day = "THU"
elif rem == 5:
    day = 'FRI'
elif rem == 6:
    day = "SAT"
else:
    day = "SUN"
print(day)

