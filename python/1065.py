a = input()
if int(a) < 100:
    res = int(a)
else:
    res = 99
    for i in range(100, int(a)+1):
        a = str(i)
        for j in range(1, len(a)-1):
            b = int(a[j]) - int(a[j-1])
            c = int(a[j+1]) - int(a[j])
            if b != c:
                break
            else:
                res += 1
                break
print(res)
