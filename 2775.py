Input = int(input())
lists = []
lists2 = []
for i in range(0,Input):
    a = int(input())
    b = int(input())
    res = 0
    for j in range(0,a+1):
        lists = lists2
        lists2 = []
        for k in range(0,b):
            if j is 0:
                lists2.append(k+1)
                res = (k+1)
            else:
                res = 0
                for l in range(0,k+1):
                    res += lists[l]
                lists2.append(res)
    print(res)
