jumsu = int(input())
score = ""
if jumsu >= 90:
    score = "A"
elif jumsu >= 80:
    score = "B"
elif jumsu >= 70:
    score = "C"
elif jumsu >= 60:
    score = "D"
else:
    score = "F"

print(score)