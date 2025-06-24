
class Solution {

    public int solution(int a, int b) {
        int answer = 0;
        String v1 = Integer.toString(a) + Integer.toString(b);
        String v2 = Integer.toString(b) + Integer.toString(a);

        answer = Integer.valueOf(v1) > Integer.valueOf(v2)
                ? Integer.valueOf(v1)
                : Integer.valueOf(v2);
        return answer;
    }
}
