int solution(vector<vector<int>> triangle) {
    int answer = 0;

    for (int i = 1; i < triangle.size(); i++) {
        triangle[i][0] += triangle[i - 1][0];
        triangle[i][i] += triangle[i - 1][i - 1];
        for (int j = 1; j < triangle[i].size() - 1; j++) {
            int x = triangle[i][j] + triangle[i - 1][j - 1];
            int y = triangle[i][j] + triangle[i - 1][j];

            triangle[i][j] = x > y ? x : y;
        }
    }

    for (int i = 0; i < triangle[triangle.size() - 1].size(); i++) {
        answer = (answer > triangle[triangle.size() - 1][i])
                     ? answer
                     : triangle[triangle.size() - 1][i];
    }

    for (auto a : triangle) {
        for (auto b : a)
            cout << b << ' ';
        cout << '\n';
    }
    return answer;
}

// 출처 : 프로그래머스 코딩 테스트 연습 - 정수 삼각형
// https://school.programmers.co.kr/learn/courses/30/lessons/43105
