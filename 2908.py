a = input().split()
b = []
for i in a:
    Str = ""
    for j in range(len(i)-1, -1, -1):
        Str += i[j]
    b.append(Str)

Max = int(b[0])
for i in b:
    if int(i) > Max:
        Max = int(i)
print(Max)
