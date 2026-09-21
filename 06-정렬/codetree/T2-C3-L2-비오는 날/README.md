---
id: "codetree:test-rainy-day"
platform: "codetree"
platform_problem_id: "test-rainy-day"
title: "비오는 날"
source_url: "https://www.codetree.ai/trails/complete/curated-cards/test-rainy-day"
difficulty: "쉬움"
primary_category: "정렬"
tags:
  - "정렬"
  - "객체"
curriculum:
  trail: "2"
  chapter: "3"
  lesson: "2"
---

# 비오는 날

- 원본: [https://www.codetree.ai/trails/complete/curated-cards/test-rainy-day](https://www.codetree.ai/trails/complete/curated-cards/test-rainy-day)

## 문제 요약

`객체`에서 다루는 개념을 적용해 입력을 처리하고, 문제 제목에 제시된 결과를 계산하는 구현 연습이다. 상세 조건은 원본 링크를 기준으로 확인한다.

## 입출력 예시

### 입력

```text
4
2036-12-27 Sun Snow
2052-08-28 Wed Rain
2043-03-21 Sat Sun
2077-08-19 Thu Rain
```

### 출력

```text
2052-08-28 Wed Rain
```

## 풀이 접근

저장된 풀이 파일을 기준으로 입력값을 필요한 형태로 변환한 뒤, 조건을 단계별로 적용해 결과를 출력한다. 풀이를 수정할 때는 원본의 경계 조건과 출력 형식을 함께 검증한다.

## 복잡도

입력 크기와 구현 방식에 따라 달라진다. 현재 풀이의 반복문·재귀 호출 범위를 기준으로 별도 계산한다.

## 풀이 파일

`rainy-day.java`
