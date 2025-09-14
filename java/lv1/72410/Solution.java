
class Solution {

    /*
   * 1. 모든 대문자 -> 모든 소문자
   * 2. 소문자, 숫자, 빼기, 밑줄, 마침표만 남기기
   * 3. 마침표 2개 이상-> 1개
   * 4. 마침표가 처음이나 끝에 있으면 제거
   * 5. 빈 문자열일 경우 "a"
   * 6. 길이 16자 이상이면 15글자만 남기기 - 4단계 다시
   * 7. 길이가 2글자 이하면 길이가 3이 될 때까지 마지막 글자 추가
     */
    public String solution(String new_id) {
        new_id = new_id.toLowerCase(); // 1
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", ""); // 2
        new_id = new_id.replaceAll("\\.+", "."); // 3
        new_id = new_id.replaceAll("^\\.+|\\.+$", ""); // 4
        if (new_id.isEmpty()) {
            new_id = "a"; // 5
        }
        if (new_id.length() >= 16) { // 6
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.+$", "");
        }
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}
