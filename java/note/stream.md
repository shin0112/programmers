# Stream

- **일련의 데이터**를 **함수형 연산**을 통해 표준화된 방법으로 쉽게 가공, 처리 가능
- Java 환경에서 **데이터의 병렬처리**를 통해 처리 속도를 올리며 데이터 분석, 가공을 위한 필수적인 도구
- for문 또는 Collection으로 처리하는 것보다 훨씬 간결해지고 명료해짐 → 코드 가독성 향상

- 유지보수성 향상
- 병렬처리 지원

## 처리 구조와 특징

- **생성 → 가공 → 소비**의 구조로 구성

1. Stream 생성

- 데이터 집합을 Stream으로 변환하는 과정
- 최초 **1번**만 수행됨
- 모든 데이터가 한꺼번에 메모리에 로드되지 않고 필요할 때만 로드

2. 가공

- 데이터 집합을 원하는 형태로 가공하는 것
- 필터(`filter`), 변형(`map`), 정렬(`sort`) 등
- 입력값은 Stream, 결과값도 Stream ⇒ 중간 연산을 연결해 **연속 수행** 가능

3. 최종 연산

- 최종 연산을 수행해 데이터 컬렉션 또는 하나의 값으로 결과값 반환
- 최종적으로 **1번**만 수행

## 📋 주요 메서드 요약

| Method                          | Description                               | Return Type |
| ------------------------------- | ----------------------------------------- | ----------- |
| `IntStream.range(int a, int b)` | a부터 b-1까지의 int collection을 stream화 | `IntStream` |
| `Stream.reduce()`               | Stream 요소들을 하나의 데이터로 만듦      | Optional<T> |

## 예시

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.reduce((x, y) -> x + y); // 15
```

## 참고자료

- [Java Stream이란 특징부터 사용하는 이유까지 모두 알려드립니다.](https://www.elancer.co.kr/blog/detail/255)
