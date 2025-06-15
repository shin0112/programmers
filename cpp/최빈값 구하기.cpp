#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int answer = 0, maxi = 0;
    
    vector<int> v(1001, 0), cnt(101, 0);
    
    for (int i = 0; i < array.size(); i++) {
        v[array[i]]++;
        
        if (v[array[i]] > 1) cnt[v[array[i]] - 1]--;
        
        cnt[v[array[i]]]++;
        if (v[array[i]] > maxi) {
            maxi = v[array[i]];
            answer = array[i];
        }
            
    }
    
    if (cnt[maxi] > 1) return -1;
    
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 최빈값 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
