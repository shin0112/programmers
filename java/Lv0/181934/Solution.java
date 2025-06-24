
class Solution {

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch (ineq + eq) {
            case ">=":
                return n >= m ? 1 : 0;
            case "<=":
                return n <= m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
            default:
                break;
        }
        return answer;
    }
}
