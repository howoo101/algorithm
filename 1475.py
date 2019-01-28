a = input()
b = ['1','2','3','4','5','6','7','8','9','0']
c = []
count = 1
for i in range(0,len(a)):
    if a[i] in b:
        b.remove(a[i])
    else:
        if a[i] == '6':
            if '9' in b:
                b.remove('9')
            else:
                for j in range(0,10):
                    b.append(str(j))
                b.sort()
                count += 1
                b.remove(a[i])
        elif a[i] == '9':
            if '6' in b:
                b.remove('6')
            else:
                for j in range(0,10):
                    b.append(str(j))
                b.sort()
                count += 1
                b.remove(a[i])
        else:
            for j in range(0, 10):
                b.append(str(j))
            b.remove(a[i])
            b.sort()
            count += 1
print(count)
