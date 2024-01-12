#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(int k, vector<int> score) {
    vector<int> answer;
    vector<int> v;
    for (int i = 0; i < score.size(); i++) {
        if (i < k) {
            v.push_back(score[i]);
            sort(v.begin(), v.end());
        } else {
            if (v[0] < score[i]) {
                v[0] = score[i];
                sort(v.begin(), v.end());
            }
        }    
        answer.push_back(v[0]);
    }
    return answer;
} 

// 출처 : 프로그래머스 코딩테스트 연습 - 명예의 전당 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
