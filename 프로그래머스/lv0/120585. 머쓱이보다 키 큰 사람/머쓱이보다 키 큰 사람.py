def solution(array, height):
    answer = 0
    array = list(map(int,array))
    for i in array:
        if(i > height):
            answer += 1
    
    return answer