def solution(id_list, report, k):
    warning = {}
    result = [0] * len(id_list)  # 각 사용자가 받을 메일 수를 저장할 리스트
    report = set(report)  # 중복 신고를 제거

    # 신고 정보 처리
    for i in report:
        tmp = i.split()  # 공백을 기준으로 신고자와 대상자를 분리
        reporter, target = tmp[0], tmp[1]

        # 타겟에 대한 신고 정보가 warning에 없으면 초기화
        if target not in warning:
            warning[target] = [0, []]  # [신고 횟수, 신고한 사용자 리스트]

        # 신고자가 중복되지 않으면 추가
        if reporter not in warning[target][1]:
            warning[target][0] += 1
            warning[target][1].append(reporter)

    # 신고 횟수가 k번 이상인 경우 메일 발송
    for target, info in warning.items():
        if info[0] >= k:  # 신고 횟수가 k 이상인 경우
            for reporter in info[1]:  # 해당 사용자를 신고한 사람들에게 메일 발송
                result[id_list.index(reporter)] += 1

    return result
