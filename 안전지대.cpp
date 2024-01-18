#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board) {
    int answer = 0;
    int n = board.size();
    vector<vector<int>> v(n + 2, vector<int>(n + 2, 0));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j] == 1) {
                v[i][j] = 1;
                v[i][j + 1] = 1;
                v[i][j + 2] = 1;
                v[i + 1][j] = 1;
                v[i + 1][j + 1] = 1;
                v[i + 1][j + 2] = 1;
                v[i + 2][j] = 1;
                v[i + 2][j + 1] = 1;
                v[i + 2][j + 2] = 1;
            }
        }
    }
    
    for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < n + 1; j++) {
            if (v[i][j] == 1) answer++;
        }
    }
    return n * n - answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 안전지대
// https://school.programmers.co.kr/learn/courses/30/lessons/120866
