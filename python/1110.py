count = 0
a = input()
res = a
while True:
    count += 1
    if int(a)/10 <1:
        a = '0'+a
    # print(a)

    b = (int(res) % 10) * 10
    c = int(int(res)/10) + (int(res) % 10)
    res = b+(c%10)
    if res is int(a):
        break
print(count)