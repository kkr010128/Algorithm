---
id: "codetree:test-print-grid-in-rectangle"
platform: "codetree"
platform_problem_id: "test-print-grid-in-rectangle"
title: "격자로 사각형 만들기"
source_url: "https://www.codetree.ai/trails/complete/curated-cards/test-print-grid-in-rectangle"
difficulty: "쉬움"
primary_category: "배열-행렬"
tags:
  - "2차원 배열"
  - "순서대로 채우기"
curriculum:
  trail: "1"
  chapter: "8"
  lesson: "4"
---

# 격자로 사각형 만들기

- 원본: [https://www.codetree.ai/trails/complete/curated-cards/test-print-grid-in-rectangle](https://www.codetree.ai/trails/complete/curated-cards/test-print-grid-in-rectangle)

## 문제 요약

`순서대로 채우기`에서 다루는 개념을 적용해 입력을 처리하고, 문제 제목에 제시된 결과를 계산하는 구현 연습이다. 상세 조건은 원본 링크를 기준으로 확인한다.

## 입출력 예시

### 입력

```text
5
```

### 출력

```text
1 1 1 1 1
1 3 5 7 9
1 5 13 25 41
1 7 25 63 129
1 9 41 129 321
```

## 풀이 접근

저장된 풀이 파일을 기준으로 입력값을 필요한 형태로 변환한 뒤, 조건을 단계별로 적용해 결과를 출력한다. 풀이를 수정할 때는 원본의 경계 조건과 출력 형식을 함께 검증한다.

## 복잡도

입력 크기와 구현 방식에 따라 달라진다. 현재 풀이의 반복문·재귀 호출 범위를 기준으로 별도 계산한다.

## 풀이 파일

`print-grid-in-rectangle.java`
