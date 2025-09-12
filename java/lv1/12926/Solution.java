
class Solution {

    /*
   * 1. 문자가 맞는지 확인
   * 2. n만큼 문자 미는 로직 작성
   * 3. 문자에서 벗어날 경우 순환하는 로직 작성
     */
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            // 문자가 맞는지 확인
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                continue;
            }

            // n만큼 밀기
            // - 대문자 / 소문자 확인하기
            // - 알파벳 길이 저장
            int alpa = Character.isUpperCase(c) ? 'A' : 'a';
            int offset = c - alpa;

            int code = (offset + n) % ('Z' - 'A' + 1);
            sb.append((char) (code + alpa));
        }

        return sb.toString();
    }
}
