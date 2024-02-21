#include <string>
#include <vector>

using namespace std;

int solution(int n, int m, vector<int> section) {
    int answer = 0;

    vector<int> v(n, 1);
    for (int i = 0; i < section.size(); i++) {
        v[section[i] - 1] = 0;
    }

    for (int i = 0; i < n; i++) {
        if (v[i] == 1)
            continue;
        i += m - 1;
        answer++;
    }

    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습문제 - 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
