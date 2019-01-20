a = int(input())
for i in range(0, a):
    b = input().split(" ")
    for j in range(0, len(b[1])):
        for k in range(0, int(b[0])):
            print(b[1][j], end="")
    print()
