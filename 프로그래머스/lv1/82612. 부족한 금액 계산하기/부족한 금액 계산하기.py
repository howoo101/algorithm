def fee(price,count):
    result = 0
    for i in range(1,count+1):
        result += (price*i)
    return result

def solution(price, money, count):
    if money - fee(price,count) > 0: return 0
    else : return abs(money - fee(price,count))
