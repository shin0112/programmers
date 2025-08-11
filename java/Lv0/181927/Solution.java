
class Solution {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int second_last = num_list[num_list.length - 2];
        int last = num_list[num_list.length - 1];

        int[] last_value = {last > second_last
            ? last - second_last
            : last * 2};

        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        System.arraycopy(last_value, 0, answer, num_list.length, last_value.length);

        return answer;
    }
}
