a = input()
b = {}
for i in range(0, len(a)):
    if b.get(ord(a[i])) is None:
        b[ord(a[i])] = i
for i in range(ord("a"), ord("z")+1):
    if b.get(i) is None:
        print("-1", end=" ")
    else:
        print(b.get(i), end=" ")

