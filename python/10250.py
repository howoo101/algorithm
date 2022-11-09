a = int(input())
for i in range(a):
    data = input().split()
    count = 0
    d = int(data[0])
    e = int(data[1])
    f = int(data[2])
    g = ""
    for j in range(1,e+1):
        n = ""
        if j<10:
            g = "0"+str(j)
        else:
            g = str(j)
        for k in range(1,d+1):
            count += 1
            n = str(k) + g
            if count == f:
                break
        if count == f:
            break
    print(n)
