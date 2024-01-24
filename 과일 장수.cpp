#include <string>
#include <vector>
#include <algorithm>

using namespace std;
bool compare(int a, int b) { return a > b; }

int solution(int k, int m, vector<int> score) {
    int answer = 0, sum = 0;

    sort(score.begin(), score.end(), compare);
    for (int i = m - 1; i < score.size(); i += m) {
        sum = m * score[i];
        answer += sum;
    }

    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 과일 장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
