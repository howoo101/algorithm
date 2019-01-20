b = {}
count = 0
num = 2
time = 2
Sum = 0
for i in range(65,91):
    if i < ord('P'):
        if i != 65 and i % 3 == 2:
            num += 1
        b[chr(i)] = num
    elif i < ord('T'):
        b[chr(i)] = 7
    elif i < ord('W'):
        b[chr(i)] = 8
    else:
        b[chr(i)] = 9
a = input()
for i in range(0,len(a)):
    Sum += b.get(a[i])+1
print(Sum)

