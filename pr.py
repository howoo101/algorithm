# days = input().split()
# month = int(days[0])
# date = int(days[1])
# days = 0
# if month != 1:
#     for i in range(1, month):
#         if i == (1 or 3 or 5 or 7 or 8 or 10 or 12):
#             mDay = 31
#         elif i == (4 or 6 or 9 or 11):
#             mDay = 30
#         else:
#             mDay = 28
#         days += mDay
# days += date
#
# rem = days % 7
# if rem == 1:
#     day = 'MON'
# elif rem == 2:
#     day = 'TUE'
# elif rem == 3:
#     day = 'WED'
# elif rem == 4:
#     day = "THU"
# elif rem == 5:
#     day = 'FRI'
# elif rem == 6:
#     day = "SAT"
# else:
#     day = "SUN"
# print(day)
#

string = input()
stringLen = len(string)
a = int(stringLen / 10)
b = int(stringLen % 10)
for i in range(0, a+1):

    if i is not 0:
        print()

    if i is a:
        c = i*10 + b
    else:
        c = 10*(i+1)
    for j in range(i * 10, c):
            print(string[j], end="")
