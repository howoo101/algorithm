lists = input().split()

idx = 0
for j in range(0,2):
    Max = int(lists[j])
    for i in range(j, len(lists)):
        if int(lists[i]) > Max:
            Max = int(lists[i])
            idx = i
    lists[idx] = lists[j]
    lists[j] = Max

print(lists[1])
