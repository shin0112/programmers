
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, 1000001);

        int index = 0;

        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && answer[index] > arr[i]) {
                    answer[index] = arr[i];
                }
            }

            if (answer[index] == 1000001) {
                answer[index] = -1;
            }
            index++;
        }

        // stream
        answer = IntStream.range(0, queries.length) // queries 길이만큼 stream
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1]) // s <= i <= e
                .map(i -> arr[i]) // i = arr[i]
                .filter(i -> i > queries[q][2]) // i > k
                .min().orElse(-1))
                .toArray();
        return answer;
    }
}
