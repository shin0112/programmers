
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {

    public int[] solution(int n) {
        // 한 번에 스트림
        IntStream.concat(
                IntStream.iterate(n, n > 1, i % 2 == 0 ? n / 2 : 3 * n + 1),
                IntStream.of(1)
        ).toArray();

        List<Integer> list = new ArrayList<>();

        list.add(n);
        while (n > 1) {
            n = n % 2 == 0
                    ? n / 2
                    : 3 * n + 1;
            list.add(n);
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

}
