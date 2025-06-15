#include <string>
#include <vector>

using namespace std;

vector<int> solution(int num, int total) {
    vector<int> answer;
    int x = 0, sum = 0;
    while (true) {
        sum = x * num + (num * (num - 1)) / 2;
        if (total == sum)
            break;
        else if (total < sum)
            x--;
        else
            x++;
    }

    for (int i = 0; i < num; i++, x++) {
        answer.push_back(x);
    }
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 연속된 수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/120923
