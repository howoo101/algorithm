a = input()
b = {}
for i in range(0, len(a)):
    if ord(a[i]) > 96:
        c = chr(ord(a[i])-32)
    else:
        c = a[i]

    if b.get(c) is None:
        b[c] = 1
    else:
        b[c] = b.get(c) + 1
d = list(b.values())
if len(d) == 1:
    print(c)
else:
    d.sort(reverse=1)
    if d[0] == d[1]:
        print("?")
    else:
        for i in b:
            if b[i] == d[0]:
                print(i)
                break