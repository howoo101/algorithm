a = int(input())
for i in range(0, a):
    lists = input().split()
    Sum = 0
    count = 0
    # print(lists)
    for j in lists:
        Sum += int(j)
    Sum -= int(lists[0])
    print(Sum)
    avg = Sum / (len(lists)-1)
    print(avg)
    for j in lists:
        if avg < int(j):
            count += 1
    if avg < int(lists[0]):
        count -= 1
    print(format(count/(len(lists)-1), ".3%"))
