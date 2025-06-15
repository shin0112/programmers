#include <string>
using namespace std;

int square (int n) {
    return n * n;
}

int cube (int n) {
    return n * n * n;
}

int solution(string dartResult) {
    int answer = 0;
    int count = -1;
    int num[3] = {0};

    for (int i = 0; i < dartResult.size();) {
        string s = "";
        count++;
        while ('0' <= dartResult[i] && dartResult[i] <= '9') {
            s.push_back(dartResult[i]);
            i++;
        }
        num[count] = stoi(s);

        if (dartResult[i] == 'S') {
            i++;
        } else if (dartResult[i] == 'D') {
            num[count] = square(num[count]);
            i++;
        } else if (dartResult[i] == 'T') {
            num[count] = cube(num[count]);
            i++;
        }

        if (dartResult[i] == '*') {
            for (int j = count - 1; j <= count; j++)
                num[j] *= 2;
            i++;
        } else if (dartResult[i] == '#') {
            num[count] *= -1;
            i++;
        }
    }
    answer = num[0] + num[1] + num[2];
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - [1차] 다트 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17682
