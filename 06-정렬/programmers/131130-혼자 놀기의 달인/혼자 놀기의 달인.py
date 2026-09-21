def solution(cards):
    answer = 0
    visited = [False for _ in range(len(cards))]  # 각 상자가 열렸는지 여부를 기록하는 배열
    lst = []  # 각 그룹의 크기를 저장할 리스트
    
    for i in range(len(cards)):  # 모든 상자를 순회하며 그룹을 형성
        if visited[i]:  # 이미 열렸다면 건너뜀
            continue
        visited[i] = True  # 현재 상자를 열었다고 표시
        cur, linked = i, 1  # 현재 상자의 인덱스와 그룹 크기를 초기화
        while cards[cur] - 1 != i:  # 다음 상자로 이동하며 그룹 형성
            cur = cards[cur] - 1  # 카드에 적힌 숫자를 인덱스로 사용하여 이동
            visited[cur] = True  # 해당 상자를 열었다고 표시
            linked += 1  # 그룹 크기를 증가시킴
        lst.append(linked)  # 그룹 크기를 리스트에 추가
        
    if len(lst) < 2:  # 그룹이 2개 미만이면 점수는 0
        answer = 0
    else:
        lst.sort(reverse=True)  # 그룹 크기를 내림차순으로 정렬
        answer = lst[0] * lst[1]  # 가장 큰 두 그룹의 크기를 곱함

    return answer  # 최종 점수를 반환