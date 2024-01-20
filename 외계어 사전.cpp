#include <string>
#include <vector>

using namespace std;

int solution(vector<string> spell, vector<string> dic) {
    int count = 0;
    vector<int> con(26, 0), check(26, 0);
    
    for (int i = 0; i < spell.size(); i++) {
        con[spell[i][0] - 'a'] = 1;
    }

    for (int i = 0; i < dic.size(); i++) {
        count = 0;
        
        for (int j = 0; j < dic[i].size(); j++) {
            if (con[dic[i][j] - 'a'] == 1 && check[dic[i][j] - 'a'] == 0) {
                check[dic[i][j] - 'a'] = 1;
                count++;
            }
            else break;
        }
        
        for (int j = 0; j < 26; j++) check[j] = 0;
        
        if (count == spell.size()) return 1;   
    }
    
    return 2;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 외계어 사전
// https://school.programmers.co.kr/learn/courses/30/lessons/120869
