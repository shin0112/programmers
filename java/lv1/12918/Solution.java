
class Solution {

    /*
   * 1. 정규식 확인하기
     */
    public boolean solution(String s) {
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}
