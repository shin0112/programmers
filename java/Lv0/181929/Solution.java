
import java.util.Arrays;

class Solution {

    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        // O(N)
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }

        // stream
        sum = Arrays.stream(num_list).sum();
        mul = Arrays.stream(num_list).reduce((a, b) -> a * b).getAsInt();

        return Math.pow(sum, 2) > mul ? 1 : 0;
    }
}
