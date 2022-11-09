a = set()
b = set()

for i in range(1,10000):
    a.add(i)
    str_i = str(i)
    Sum = 0
    for j in range(0, len(str_i)):
        Sum += int(str_i[j])
    if i+Sum < 10000:
        b.add(i+Sum)
c = list(a.difference(b))
c.sort()
for i in c:
    print(i)
