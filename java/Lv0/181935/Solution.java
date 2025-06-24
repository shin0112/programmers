
class Solution {

    public int solution(int n) {
        int answer = 0;
        int k = 0;
        if (n % 2 != 0) {
            k = n / 2 + 1;
            answer = k * k;
        } else {
            k = n / 2;
            answer = 2 * k * (k + 1) * (2 * k + 1) / 3;
        }
        return answer;
    }
}
