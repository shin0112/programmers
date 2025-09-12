# String

## 📋 주요 메서드 요약

| Method      | Description      | Return type |
| ----------- | ---------------- | ----------- |
| `charAt(i)` | i번째 문자 반환  | `char`      |
| `length()`  | 문자열 길이 반환 | `int`       |
| `join()`    | 문자열 더하기    | `string`    |

### charAt

- 특정 위치의 문자 가져오기
- 💡 Java에서는 `[]`로 character를 가져올 수 없다!

### length

- 문자열 길이 반환하기

```java
String s = "abc";
char c = s.charAt(1); // 'b'
int len = s.length();  // 3
```

### join

- 문자열 더하기

```java
String arr[] = ["a", "b"];
String.join("", arr); // ab
```

### StringBuilder

- string 만들어주는 builder!!
