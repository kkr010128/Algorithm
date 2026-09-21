def solution(players, callings):
    result = {player: i for i, player in enumerate(players)} # 선수: 등수
    for name in callings:
        idxTmp = result[name] # 현재 등수
        result[name] -= 1 # 등수 변경
        result[players[idxTmp-1]] += 1 # 등수 Idx 뒤로 변경
        players[idxTmp-1], players[idxTmp] = players[idxTmp], players[idxTmp-1] # 위치 교환
    return players