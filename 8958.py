inputs = int(input())
for k in range(0,inputs):
    a = input()
    Sum = 0
    for i in range(0, len(a)):
        count = 0
        if a[i] is "O":
            for j in range(0, i+1):
                if a[j] is "O":
                    count += 1
                else:
                    count = 0
        Sum += count
    print(Sum)
