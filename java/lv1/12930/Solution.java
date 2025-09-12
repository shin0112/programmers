
class Solution {

    /*
   * 1. 공백문자 확인
   * - 공백문자일 경우 다음 문자 대문자
   * - 공백문자는 그대로
   * 2. 전문자가 대문자 -> 소문자 / 소문자 -> 대문자
     */
    public String solution(String s) {
        boolean isUpper = true;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            // 공백문자 확인
            if (!Character.isAlphabetic(c)) {
                isUpper = true;
                sb.append(c);
                continue;
            }

            sb.append(isUpper
                    ? Character.toUpperCase(c)
                    : Character.toLowerCase(c));
            isUpper = !isUpper;
        }

        return sb.toString();
    }
}
