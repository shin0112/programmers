
class Solution {

    /*
    * 1. 문자열 소문자로 바꾸기
    * 2. p와 y만 처리해서 개수 세기
    * 3. 개수가 같은 경우 true
     */
    boolean solution(String s) {
        // 소문자 바꾸기
        s = s.toLowerCase();
        int p = s.length() - s.replace("p", "").length();
        int y = s.length() - s.replace("y", "").length();

        return p == y;
    }
}
