
class Solution {

    /*
   * 1. 숫자 & 영단어 매핑 배열 만들기
   * 2. s에서 찾고, replace하기
     */
    public int solution(String s) {
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < 10; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
