---
id: "codetree:intro-sort-by-height"
platform: "codetree"
platform_problem_id: "intro-sort-by-height"
title: "키를 기준으로 정렬"
source_url: "https://www.codetree.ai/trails/complete/curated-cards/intro-sort-by-height"
difficulty: "쉬움"
primary_category: "정렬"
tags:
  - "정렬"
  - "객체 정렬"
curriculum:
  trail: "2"
  chapter: "3"
  lesson: "3"
---

# 키를 기준으로 정렬

- 원본: [https://www.codetree.ai/trails/complete/curated-cards/intro-sort-by-height](https://www.codetree.ai/trails/complete/curated-cards/intro-sort-by-height)

## 문제 요약

`객체 정렬`에서 다루는 개념을 적용해 입력을 처리하고, 문제 제목에 제시된 결과를 계산하는 구현 연습이다. 상세 조건은 원본 링크를 기준으로 확인한다.

## 입출력 예시

### 입력

```text
5
lee 167 40
kim 149 32
park 161 53
choi 183 70
jung 155 45
```

### 출력

```text
kim 149 32
jung 155 45
park 161 53
lee 167 40
choi 183 70
```

## 풀이 접근

저장된 풀이 파일을 기준으로 입력값을 필요한 형태로 변환한 뒤, 조건을 단계별로 적용해 결과를 출력한다. 풀이를 수정할 때는 원본의 경계 조건과 출력 형식을 함께 검증한다.

## 복잡도

입력 크기와 구현 방식에 따라 달라진다. 현재 풀이의 반복문·재귀 호출 범위를 기준으로 별도 계산한다.

## 풀이 파일

`sort-by-height.java`
