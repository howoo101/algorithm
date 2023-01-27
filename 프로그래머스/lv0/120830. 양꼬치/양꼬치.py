def solution(n, k):
#     10인분당 음료 하나
# 12000 / 2000
    # n = int(n)
    # k = int(k)
    k -= n//10
    
    answer = 0
    answer += (k*2000) + (12000*n)
    
    return answer