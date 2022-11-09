a = int(input())
b = []
for i in range(0, a):
    b.append(int(input()))
for j in range(0, len(b)-1):
    Max = b[0]
    idx = 0
    for k in range(1, len(b)-j):
        if b[k] > Max:
            Max = b[k]
            idx = k
    temp = b[idx]
    b[idx] = b[len(b)-1-j]
    b[len(b)-1-j] = temp

for i in b:
    print(i)