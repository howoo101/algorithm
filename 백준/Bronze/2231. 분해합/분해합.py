N = int(input())

for i in range(1, N+1):
    numStr = str(i)
    eachSum = sum(list(map(int, ' '.join(numStr).split())))
    total = eachSum + i
    if N == total:
        print(i)
        exit()
print('0')

