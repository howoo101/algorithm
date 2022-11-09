Sum = 0
for i in range(0,5):
    a = int(input())
    if a < 40:
       a = 40
    Sum += a
avg = int(Sum / 5)
print(avg)
