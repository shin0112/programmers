#include <string>
#include <vector>

using namespace std;

int solution(vector<string> babbling) {
    int answer = 0;
    bool is_babbling = false;
    for (int i = 0; i < babbling.size(); i++) {
        is_babbling = false;
        string s = babbling[i];
        for (int j = 0; j < s.size();) {
            if (s.size() < 2) break;
            else if ((s[j] == 'a' && s[j + 1] == 'y' && s[j + 2] == 'a') || 
                     (s[j] == 'w' && s[j + 1] == 'o' && s[j + 2] == 'o')) {
                j += 3;
                if (j == s.size()) is_babbling = true;
            }
            else if ((s[j] == 'y' && s[j + 1] == 'e') || 
                     (s[j] == 'm' && s[j + 1] == 'a')) {
                j += 2;
                if (j == s.size()) is_babbling = true;
            }
            else {
                is_babbling = false;
                break;
            }
        }
        if (is_babbling) answer++;
    }
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 옹알이 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/120956
