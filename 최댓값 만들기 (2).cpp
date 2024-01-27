#include <algorithm>
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0, size = numbers.size();
    
    sort(numbers.begin(), numbers.end());
    answer = max(numbers[0] * numbers[1], numbers[size - 2] * numbers[size - 1]);
    
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 최댓값 만들기 (2)
// https://school.programmers.co.kr/learn/courses/30/lessons/120862
