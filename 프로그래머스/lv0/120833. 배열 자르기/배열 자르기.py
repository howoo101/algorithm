def solution(numbers, num1, num2):
    answer = []
    for i in range(len(numbers)):
        if(i >=num1 and i <= num2):
            answer.append(numbers[i])
    return answer