
import java.util.stream.IntStream;

class Solution {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // for (int i = 0; i < included.length; i++) {
        //     if (included[i]) {
        //         answer += a + d * i;
        //     }
        // }

        // stream
        // IntStream.range를 사용하는 이유: index를 사용하기 위해서
        answer = IntStream.range(0, included.length)
                .filter(i -> included[i] == true)
                .map(i -> a + d * i)
                .sum();
        return answer;
    }
}
