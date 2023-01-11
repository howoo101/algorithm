def solution(numbers):
    answer = 0
    arr = list(range(1,10))
    for x in numbers:
        if(x in arr): arr.remove(x)
    return sum(arr)