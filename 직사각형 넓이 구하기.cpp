#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0, x = 0, y = 0;
    if (dots[0][0] == dots[1][0]) {
        x = dots[3][0] - dots[0][0];
        y = dots[0][1] - dots[1][1];
    }
    else {
        x = dots[1][0] - dots[0][0];    
        y = dots[0][1] - dots[3][1];
    }
    answer = x * y > 0 ? x * y : -1 * x * y;
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 직사각형 넓이 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120860
