b = int(input())
count = 0

for j in range(0, b):
    a = input()
    if len(a) < 3:
        count += 1
    else:
        for i in range(0,len(a)):
            br = 0
            if i == len(a)-1:
                count += 1
            else:
                if a[i] == a[i+1]:
                    continue
                else:
                    for k in range(i+2,len(a)):
                        if a[i] == a[k]:
                            br = 1
                            break
                        else:
                            if i == len(a)-2 and k == len(a)-1:
                                count += 1
                    if br == 1:
                        break
print(count)