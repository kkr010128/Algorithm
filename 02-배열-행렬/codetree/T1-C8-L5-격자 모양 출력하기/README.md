---
id: "codetree:test-print-grid-shape"
platform: "codetree"
platform_problem_id: "test-print-grid-shape"
title: "격자 모양 출력하기"
source_url: "https://www.codetree.ai/trails/complete/curated-cards/test-print-grid-shape"
difficulty: "쉬움"
primary_category: "배열-행렬"
tags:
  - "2차원 배열"
  - "격자로서의 2차원 배열"
curriculum:
  trail: "1"
  chapter: "8"
  lesson: "5"
---

# 격자 모양 출력하기

- 원본: [https://www.codetree.ai/trails/complete/curated-cards/test-print-grid-shape](https://www.codetree.ai/trails/complete/curated-cards/test-print-grid-shape)

## 문제 요약

`격자로서의 2차원 배열`에서 다루는 개념을 적용해 입력을 처리하고, 문제 제목에 제시된 결과를 계산하는 구현 연습이다. 상세 조건은 원본 링크를 기준으로 확인한다.

## 입출력 예시

### 입력

```text
3 3
1 1
3 2
3 3
```

### 출력

```text
1 0 0
0 0 0
0 6 9
```

## 풀이 접근

저장된 풀이 파일을 기준으로 입력값을 필요한 형태로 변환한 뒤, 조건을 단계별로 적용해 결과를 출력한다. 풀이를 수정할 때는 원본의 경계 조건과 출력 형식을 함께 검증한다.

## 복잡도

입력 크기와 구현 방식에 따라 달라진다. 현재 풀이의 반복문·재귀 호출 범위를 기준으로 별도 계산한다.

## 풀이 파일

`print-grid-shape.java`
