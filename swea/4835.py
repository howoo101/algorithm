#구간합 - 슬라이딩 윈도우?

T = int(input())
for tc in range(1,T+1):
    N, M = map(int,input().split())

    arr = list(map(int,input().split()))

    tmpSum = maxSum = minSum = sum(arr[:M])

    idx = 0
    for value in arr[M:]:
        tmpSum -= arr[idx]
        tmpSum += value

        minSum = min(tmpSum, minSum)
        maxSum = max(tmpSum, maxSum)
        idx += 1

    print(f'#{tc} {maxSum-minSum}')
