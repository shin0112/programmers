
class Solution {

    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};

    /*
   * 1. n * n 배열 만들기
   * 2. 숫자 하나씩 채우기 (아래 -> 오른쪽 -> 위)
     */
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int v = 1, x = 0, y = 0, d = 0;

        while (true) {
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                    break;
                }
                x = nx;
                y = ny;
            }
            x = nx;
            y = ny;
        }

        int[] answer = new int[v - 1];
        int index = 0;

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }
}
