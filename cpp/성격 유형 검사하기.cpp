#include <string>
#include <vector>
#include <map>

using namespace std;

string solution(vector<string> survey, vector<int> choices) {
    string answer = "";
    map<char, int> m = {{'R', 0}, {'T', 0}, {'C', 0}, {'F', 0},
                        {'J', 0}, {'M', 0}, {'A', 0}, {'N', 0}};
    for (int i = 0; i < survey.size(); i++) {
        if (choices[i] < 4)
            m[survey[i][0]] += (4 - choices[i]);
        else if (choices[i] > 4)
            m[survey[i][1]] += (choices[i] - 4);
    }

        m['R'] >= m['T'] ? answer.push_back('R') : answer.push_back('T');
        m['C'] >= m['F'] ? answer.push_back('C') : answer.push_back('F');
        m['J'] >= m['M'] ? answer.push_back('J') : answer.push_back('M');
        m['A'] >= m['N'] ? answer.push_back('A') : answer.push_back('N');
    
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 성격 유형 검사하기
// https://school.programmers.co.kr/learn/courses/30/lessons/118666
