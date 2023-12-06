T = int(input())
for tc in range(1, T+1):
    idx, wrong = input().split()
    idx = int(idx)-1
    print(wrong[0:idx]+wrong[idx+1:])
