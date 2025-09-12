
class Solution {

    /*
   * 1. String으로 변환 후 뒤집기
   * 2. 배열로 변환(String -> char[] -> int[])
   * 
     */
    public int[] solution(long n) {

        // String으로 변환 후 뒤집기
        String s = Long.toString(n);
        s = new StringBuilder(s).reverse().toString();

        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = s.charAt(i) - '0';
        }

        return answer;
    }
}
