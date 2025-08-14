
import java.util.stream.IntStream;

class Solution {

    public int[] solution(int l, int r) {

        int[] answer = IntStream.rangeClosed(l, r)
                .filter(i -> Integer.toString(i).matches("[05]+"))
                .toArray();

        // 이진수 풀이법
        // 1,000,000 = 64
        answer = IntStream.range(1, 64)
                .map(i -> Integer.parseInt(Integer.toBinaryString(i)) * 5)
                .filter(i -> l <= i && i <= r)
                .toArray();

        return answer.length == 0
                ? new int[]{-1}
                : answer;
    }
}
