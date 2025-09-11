
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    /*
    * 풀이 순서
    * 1. 모든 직선에 대해 교점 구하기
    * 2. 최소한의 크기 구하기
    * 3. 배열 만들기
    * 4. 교점 찍기
     */
    public String[] solution(int[][] line) {

        // 1. 모든 직선 교점 구하기
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i; j < line.length; j++) {
                Point point = intersection(
                        line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if (point != null) {
                    points.add(point);
                }
            }
        }

        // 2. 좌표 최소, 최대값 구하기
        Point maxPoint = getMaximumPoint(points);
        Point minPoint = getMinimumPoint(points);

        int width = (int) maxPoint.x - (int) minPoint.x + 1;
        int height = (int) maxPoint.y - (int) minPoint.y + 1;

        // 3. 배열 만들기
        char[][] arr = new char[height][width];
        for (char[] c : arr) {
            Arrays.fill(c, '.');
        }

        // 4. 교점 찍기
        for (Point p : points) {
            arr[(int) (maxPoint.y - p.y)][(int) (p.x - minPoint.x)] = '*';
        }

        String[] answer = new String[height];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = new String(arr[i]);
        }
        return answer;
    }

    // 좌표 클래스 작성
    private static class Point {

        long x;
        long y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private static Point intersection(
            long a1, long b1, long c1,
            long a2, long b2, long c2
    ) {
        // a1x + b1y + c1 = 0
        // a2x + b2y + c2 = 0
        // x = (b1y + c1) / a1 = (b2y + c2) / a2
        // a2(b1y + c1) = a1(b2y + c2)
        // a2b1y - a1b2y = a1c2 - c2c1
        // y = (a1c2 - a2c1) / (a2b1 - a1b2)
        // y = (c1 + a1x) / -b1 = (c2 + a2x) / -b2
        // b2(c1 + a1x) = b1(c2 + a2x)
        // (a1b2 - a2b1)x = b1c2 - b2c1
        // x = (b1c2 - b2c1) / (a1b2 - a2b1)

        // 직선이 평행할 경우 infinity가 나올 수 있음 -> double 일 경우에는 오류 발생 아니라서 double 반드시 작성해줘야 함!!
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a1 * c2 - a2 * c1) / (a2 * b1 - a1 * b2);
        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        return new Point((long) x, (long) y);
    }

    private static Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        for (Point p : points) {
            if (p.x < x) {
                x = p.x;
            }
            if (p.y < y) {
                y = p.y;
            }
        }
        return new Point(x, y);
    }

    private static Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        for (Point p : points) {
            if (p.x > x) {
                x = p.x;
            }
            if (p.y > y) {
                y = p.y;
            }
        }
        return new Point(x, y);
    }
}
