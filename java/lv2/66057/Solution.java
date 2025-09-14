
import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    * 1. 입력된 문자열 s을 1 ~ s의 길이 만큼 자르는 반복문 만들기
    * 2. 길이만큼 잘라서 압축한 후 최종 압축 길이가 짧을 경우 answer에 저장하기
    * - 자른 문자열을 토큰으로 저장하고, 다음에 나오는 토큰과 같으면 count 세서 +1 / 다르면 다음 문자열을 토큰으로 저장하고 넘어가기
     */
    public int solution(String s) {
        int answer = s.length();

        // 입력된 문자열 압축하는 반복문 만들기
        for (int length = 1; length <= s.length(); length++) {
            // 토큰 리스트 저장  
            List<String> tokens = split(s, length);

            int compressed = compress(tokens);

            if (answer > compressed) {
                answer = compressed;
            }
        }

        return answer;
    }

    private int compress(List<String> tokens) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String last = "";

        for (String token : tokens) {
            if (last.equals(token)) {
                count++;
            } else {
                // 0, 1인 경우 생략
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(last);
                last = token;
                count = 1;
            }
        }

        int compressed = sb.toString().length();
        return compressed;
    }

    private List<String> split(String s, int length) {
        List<String> tokens = new ArrayList<>();
        for (int startIndex = 0; startIndex < s.length(); startIndex += length) {
            tokens.add(
                    startIndex + length < s.length()
                    ? s.substring(startIndex, startIndex + length)
                    : s.substring(startIndex, s.length()));
        }

        tokens.add("");
        return tokens;
    }
}
