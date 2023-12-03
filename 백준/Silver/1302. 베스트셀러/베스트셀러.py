N = int(input())
most = dict()
for i in range(N):
    tmp = input()
    if most.get(tmp,0) == 0:
        most[tmp] = 1
    else:
        most[tmp] += 1


print(sorted(most.items(), key = lambda x:[-x[1],x[0]])[:1][0][0])