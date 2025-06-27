
class Solution {

    public String solution(String code) {
        boolean mode = false;
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
            } else if (i % 2 == (mode ? 1 : 0)) {
                answer += code.charAt(i);
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
