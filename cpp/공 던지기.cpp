#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int k) {
    int answer = 0, idx = 0;
    int size = numbers.size();
    for (int i = 0; i < k - 1; i++) {
        idx += 2;
        if (idx > size) idx = idx % size;
    }
    answer = numbers[idx];
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 공 던지기
// https://school.programmers.co.kr/learn/courses/30/lessons/120843
