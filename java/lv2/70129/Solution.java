
class Solution {

    /*
    * 1. x의 0개수 세기
    * 2. x의 길이를 이진법으로 표현
     */
    public int[] solution(String s) {
        int[] answer = new int[]{0, 0};
        int zeroCount = 0;

        while (true) {
            // 0 개수 세기
            zeroCount = countZero(s);
            answer[1] += zeroCount;

            // 원래 string에서 0개수 뺀만큼 길이
            int length = s.length() - zeroCount;
            // 이진법으로 변환
            s = Integer.toString(length, 2);

            answer[0]++;

            if (length == 1) {
                break;
            }
        }
        return answer;
    }

    private int countZero(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                count++;
            }
        }
        return count;
    }

}
