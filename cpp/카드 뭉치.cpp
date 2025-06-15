#include <string>
#include <vector>

// 기존 풀이
string solution(vector<string> cards1, vector<string> cards2,
                vector<string> goal) {

    int i = 0, j = 0, k = 0;

    for (; i < goal.size(); i++, j++) {
        if (goal[i] != cards1[j])
            if (goal[i] != cards2[k])
                return "No";
            else if (goal[i] == cards2[k])
                for (; k < cards2.size() && i < goal.size(); i++, k++) {
                    if (goal[i] != cards2[k])
                        if (goal[i] != cards1[j])
                            return "No";
                        else if (goal[i] == cards1[j])
                            break;
                }
    }

    return "Yes";
}

// 참고 풀이
string solution(vector<string> cards1, vector<string> cards2,
                vector<string> goal) {

    int i = 0, j = 0, k = 0;

    for (; i < goal.size(); i++) {
        if (goal[i] == cards1[j])
            j++;
        else if (goal[i] == cards2[k])
            k++;
        else
            return "No";
    }

    return "Yes";
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 카드 뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
