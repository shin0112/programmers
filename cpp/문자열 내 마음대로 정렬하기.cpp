#include <algorithm>
#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    
    sort(strings.begin(), strings.end());
    vector<vector<string>> v(26, vector<string>(0, ""));
    
    for (int i = 0; i < strings.size(); i++) {
        v[strings[i][n] - 'a'].push_back(strings[i]);
    }
    
    for (int i = 0; i < v.size(); i++) {
        for (int j = 0; j < v[i].size(); j++) {
            answer.push_back(v[i][j]);
        }
    }
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
