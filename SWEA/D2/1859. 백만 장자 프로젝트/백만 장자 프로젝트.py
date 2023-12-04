T = int(input())
for tc in range(1,T+1):
    n = int(input())
    price = list(map(int,input().split()))

    max_p = 0
    profit = 0

    for p in price[::-1]:
        if p > max_p:
            max_p = p

        else:
            profit += max_p - p
    print(f'#{tc} {profit}')
