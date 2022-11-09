a = input()
b = "1 2 3 4 5 6 7 8"
c = "8 7 6 5 4 3 2 1"
if a == b:
    res = "ascending"
elif a == c:
    res = "descending"
else:
    res = "mixed"
print(res)