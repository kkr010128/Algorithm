def solution(k, m, score):
    sortdBox = sorted(score, reverse=True) # 전체 사과를 내림차순으로 정렬
    sum = 0

    for i in range(m-1, len(score), m): # 정렬된 사과들을 한 상자에 담을 수 있는 사과의 수 간격으로 카운트
        sum += sortdBox[i] * m # 가장 작은 가격의 사과 값 * 상자 내 사과 갯수

    return sum