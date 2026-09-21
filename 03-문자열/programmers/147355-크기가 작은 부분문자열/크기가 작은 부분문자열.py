def solution(t, p):
    max = len(t) - 1
    i = 0
    j = 0
    lenP = len(p)
    answer = 0

    while (j <= max): 
        if (int(t[i:lenP + j]) <= int(p)):
            answer += 1     
        i += 1
        j += 1
        if (i == len(t)- len(p) + 1):
            return answer