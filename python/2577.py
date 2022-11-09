a = int(input())
b = int(input())
c = int(input())
res = str(a * b * c)
d = [0,0,0,0,0,0,0,0,0,0]
for i in range(0,len(res)):
    for j in range(0,10):
        if res[i] == str(j):
            d[j] += 1
            break
for i in d:
    print(i)
