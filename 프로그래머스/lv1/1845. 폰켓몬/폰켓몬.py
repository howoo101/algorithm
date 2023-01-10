def solution(nums):
    arr = list(set(nums))

    if len(arr) > len(nums)//2: 
        answer = len(nums)//2
    else :
        answer = len(arr)
        
    return answer