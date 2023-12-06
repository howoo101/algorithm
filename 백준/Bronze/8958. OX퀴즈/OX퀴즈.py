T = int(input())


for i in range(1, T+1):
    arr = input()
    flag = True
    start = 1

    if arr[0] == 'O':
        total = 1
    else:
        total = 0
    prev = arr[0]

    for j in arr[1:]:
        if prev == j:
            flag = True
        else:
            flag = False

        if j == 'O':
            if flag:
                start += 1
            total += start
        else:
            start = 1

        prev = j

    print(total)
