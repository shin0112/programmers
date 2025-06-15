#include <string>
#include <vector>

using namespace std;

void dfs(int x, int y, int size, vector<vector<int>> &arr, vector<int> &v) {
    bool is_same = true;
    int one = 0, zero = 0;

    if (size < 2)
        return;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (arr[x + i][y + j] == 0)
                zero = 1;
            else
                one = 1;
            if (one && zero) {
                is_same = false;
                break;
            }
        }
    }

    if (is_same) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[x + i][y + j] += 2;
            }
        }
        v[arr[x][y] - 2]++;
    } else {
        dfs(x, y, size / 2, arr, v);
        dfs(x, y + size / 2, size / 2, arr, v);
        dfs(x + size / 2, y, size / 2, arr, v);
        dfs(x + size / 2, y + size / 2, size / 2, arr, v);
    }
}

vector<int> solution(vector<vector<int>> arr) {
    vector<int> answer(2, 0);

    dfs(0, 0, arr.size(), arr, answer);

    for (int i = 0; i < arr.size(); i++) {
        for (int j = 0; j < arr[0].size(); j++) {
            if (arr[i][j] == 0)
                answer[0]++;
            else if (arr[i][j] == 1)
                answer[1]++;
            else
                continue;
        }
    }

    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 쿼드압축 후 개수 세기
// https://school.programmers.co.kr/learn/courses/30/lessons/68936#
