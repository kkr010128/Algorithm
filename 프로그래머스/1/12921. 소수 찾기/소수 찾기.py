import math

def solution(n):
    result = []
    tmp = [True for i in range(n+1)]

    for i in range(2, int(math.sqrt(n))+1):
        if tmp[i] == True:
            j = 2
            while i * j <= n:
                tmp[i*j] = False
                j+=1

    for j in range(2,n+1):
        if tmp[j]:
            result.append(j)

    return len(result)