#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    
    for (int i = 0; i < s.size(); i++) {
        if (s[i] == ' ') answer.push_back(' ');
        else if ('A' <= s[i] && s[i] <= 'Z') answer.push_back((s[i] - 'A' + n) % 26 + 'A');
        else answer.push_back((s[i] - 'a' + n) % 26 + 'a');
    }
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926?language=cpp
