a = input()
count = 0
b = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
cut = 0
while True:
    new = ""
    if len(a) == 0:
        break
    if len(a) > 1:
        if a[0] != "d":
            c = a[0]+a[1]
        else:
            if a[0]+a[1] == "d-":
                c = a[0]+a[1]
            elif len(a) > 2:
                c = a[0]+a[1]+a[2]
        for i in b:
            if i == c:
                count += 1
                cut = len(i)
                break
            else:
                if b.index(i) == len(b)-1:
                    count += 1
                    cut = 1
    else:
        count += 1
    for i in range(cut, len(a)):
        new += a[i]
    a = new
print(count)
