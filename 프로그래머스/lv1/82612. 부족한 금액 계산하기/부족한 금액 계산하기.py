def fee(price,count):
    result = 0
    for i in range(1,count+1):
        result += (price*i)
    return result


def solution(price, money, count):
    return 0 if money - fee(price,count) > 0 else abs(money - fee(price,count))
