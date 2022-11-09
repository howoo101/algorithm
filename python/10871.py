contents = []
while True:
    try:
        lists = input().split()
    except EOFError:
        break
    contents.append(lists)

count = contents[0][0]
Max = int(contents[0][1])
seq = contents[1]
for i in seq:
    if int(i) < Max:
        print(i, end=' ')

