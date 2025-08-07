
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    public int solution(int a, int b, int c) {
        // if (a == b && b == c) {
        //     return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        // } else if (a != b && a != c && b != c) {
        //     return (a + b + c);
        // } else {
        //     return (a + b + c) * (a * a + b * b + c * c);
        // }

        // set 써서 중복 확인하기
        int sum = a + b + c;
        int square = a * a + b * b + c * c;
        int cube = a * a * a + b * b * b + c * c * c;
        Set<Integer> set = new HashSet<>(Arrays.asList(a, b, c));
        return switch (set.size()) {
            case 1 ->
                sum * square * cube;
            case 2 ->
                sum * square;
            case 3 ->
                sum;
            default ->
                0;
        };
    }
}
