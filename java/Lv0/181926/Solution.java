
class Solution {

    int changeNum(char c) {
        return switch (c) {
            case 'w' ->
                1;
            case 's' ->
                -1;
            case 'd' ->
                10;
            case 'a' ->
                - 10;
            default ->
                0;
        };
    }

    public int solution(int n, String control) {
        int answer = n;

        answer += control.chars()
                .map(c -> changeNum((char) c))
                .sum();

        // for 문
        // for (char c : control.toCharArray()) {
        //     answer += changeNum(c);
        // }
        return answer;
    }
}
