
class Solution {

    public String solution(String[] arr) {
        String answer = "";

        for (String s : arr) {
            answer += s;
        }

        // join문으로도 가능
        // String.join("", arr);
        return answer;
    }
}
