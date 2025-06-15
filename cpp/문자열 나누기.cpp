#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0, cnt_s = 0, cnt_d = 0;
    char c = s[0];
    s += " ";
    
    for (int i = 0; i < s.size() - 1; i++) {
        if (s[i] == c) cnt_s++;
        else if (s[i] != c) cnt_d++;
        
        if (cnt_s == cnt_d || i == s.size() - 2) {
            answer++;
            cnt_s = 0;
            cnt_d = 0;
            c = s[i + 1];
        }
    }
    
    
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
