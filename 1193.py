a = int(input())
count = 1
count2 = 0
b=1 #front
c=1 #back
i = 1
while i < a+1:
    if count == count2:
        count2 = 0
        count += 1

    if count2 == 0:
        if count %2 ==0:
            b = 1
            c = count
        else:
            b = count
            c = 1
    else:
        if count %2 == 0:
            b += 1
            c -= 1
        else:
            b -= 1
            c += 1
    i += 1
    count2 += 1
print(str(b)+"/"+str(c))