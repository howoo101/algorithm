T = int(input())


def pelindrome():
    for tc in range(1, T + 1):
        k = int(input())
        tmp = []
        for k in range(1, k + 1):
            tmp.append(input())

        for i in range(k):
            for j in range(k):
                if i != j:
                    word = tmp[i] + tmp[j]
                    if word == word[::-1]:
                        return word
        return 0


for i in range(1, T + 1):
    print(pelindrome())
