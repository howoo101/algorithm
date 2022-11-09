contents = []
while True:
    try:
        line = input()
    except EOFError:
        break
    contents.append(line)
count = int(contents[0])
contents = contents[1].split()
Max = int(contents[0])
Sum = 0
for i in contents:
    num = int(i)
    if num > Max:
        Max = num
    Sum += num

print(Sum/Max*100/count)
