def solution(bandage, health, attacks):
    j = 0
    counter = 0
    max = health
    
    for sec in range(1, attacks[-1][0] + 1): # 가장 마지막 공격 시간까지 반복
        counter += 1
        
        if (health >= max): # 이전에 회복한 체력이 최대 체력을 넘어섰을 경우 최대 체력으로 초기화
            health = max
            
        if (health <= 0): # 남은 체력이 0보다 작거나 같을 때
            return -1

        elif (sec == attacks[j][0]): # 공격을 받았을 때 (현재 초와 공격 시간이 같을 때)
            health -= attacks[j][1]
            j += 1
            counter = 0
            if (health <= 0): # 남은 체력이 0보다 작거나 같을 때
                return -1

        elif (counter == bandage[0]): # 연속 회복에 성공했을 때
            health += bandage[1] + bandage[2]
            counter = 0

        else:   #공격을 받지 않았을 때
            health += bandage[1]

    return health