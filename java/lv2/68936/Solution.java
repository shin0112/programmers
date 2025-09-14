
class Solution {

    /*
    * 1. 검사할 범위 지정하기
    * - 범위 4개 0 ~ 2^n-1 -1 / 2^n-1 ~ 2^n - 1 
    * 2. 범위 내에 0과 1개수 세기 
    * - 종료 조건 : 검사 범위가 모두 0이거나 1일 경우
    * 3. 모두 0이거나 1이 아닐 경우 재귀 호출
     */
    private static class Count {

        int zero;
        int one;

        private Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        private Count add(Count other) {
            this.zero += other.zero;
            this.one += other.one;
            return this;
        }
    }

    private Count pressQuad(int x, int y, int size, int arr[][]) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[y][x] != arr[j][i]) {
                    // 4개로 나눠서 더하기
                    size = size / 2;
                    return pressQuad(x, y, size, arr)
                            .add(pressQuad(x + size, y, size, arr))
                            .add(pressQuad(x, y + size, size, arr))
                            .add(pressQuad(x + size, y + size, size, arr));
                }
            }
        }
        // 모든 원소가 같은 값
        return arr[y][x] == 1 ? new Count(0, 1) : new Count(1, 0);
    }

    public int[] solution(int[][] arr) {
        Count count = pressQuad(0, 0, arr.length, arr);
        int[] answer = {count.zero, count.one};
        return answer;
    }
}
