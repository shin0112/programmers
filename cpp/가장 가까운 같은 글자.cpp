#include <string>
#include <vector>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer(s.size(), 0);
    vector<int> v('z' - 'a' + 1, -1);
    for(int i = 0; i < s.size(); i++) {
        int index = s[i] - 'a';
        if(v[index] == -1) {
            v[index] = i;
            answer[i] = -1;
        }
        else {
            answer[i] = i - v[index];
            v[index] = i;
        }
    }
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 가장 가까운 같은 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
