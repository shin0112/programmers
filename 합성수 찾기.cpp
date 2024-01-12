#include <string>
#include <vector>

using namespace std;

bool primary(int n) {
    for (int i = 2; i < n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int solution(int n) {
    if (n <= 3) return 0;
    int pc = 0;
    for (int i = 1; i <= n; i++) {
        if(primary(i)) pc++;
    }
    
    return n - pc;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 합성수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/120846
