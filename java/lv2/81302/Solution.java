
class Solution {

    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};

    private static final int ROOM_SIZE = 5;

    /*
  * 1. P위치에서 맨해튼 거리 1 검사
  * 2. 추가로 확일할 수 있을 경우 맨해튼 거리 2까지 검사
  * break 조건 -> 파티션 존재, 배열 벗어남, 맨해튼 거리 2 벗어남
     */
    public int[] solution(String[][] places) {
        int[] answer = new int[ROOM_SIZE];
        int index = 0;

        for (String[] place : places) {
            // 방 하나씩 char[][]로 만들어서 실행
            char[][] room = new char[ROOM_SIZE][];
            for (int i = 0; i < ROOM_SIZE; i++) {
                room[i] = place[i].toCharArray();
            }

            // P위치에서 맨해튼 거리 검사
            boolean flag = isDistanced(room);
            answer[index++] = flag ? 0 : 1;
        }
        return answer;
    }

    private boolean isDistanced(char[][] room) {
        for (int i = 0; i < ROOM_SIZE; i++) {
            for (int j = 0; j < ROOM_SIZE; j++) {
                if (room[j][i] != 'P') {
                    continue;
                }
                if (isDistanced(room, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isDistanced(char[][] room, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (ny < 0 || ny >= ROOM_SIZE || nx < 0 || nx >= ROOM_SIZE) {
                continue;
            }
            switch (room[ny][nx]) {
                case 'P':
                    return true;
                case 'O':
                    if (isDistanced(room, nx, ny, i)) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    private static boolean isDistanced(char[][] room, int x, int y, int exclude) {
        for (int i = 0; i < 4; i++) {
            if (exclude + i == 3) {
                continue;
            }

            int nx = x + dx[i];
            int ny = y + dy[i];
            if (ny < 0 || ny >= ROOM_SIZE || nx < 0 || nx >= ROOM_SIZE) {
                continue;
            }

            if (room[ny][nx] == 'P') {
                return true;
            }
        }
        return false;
    }
}
