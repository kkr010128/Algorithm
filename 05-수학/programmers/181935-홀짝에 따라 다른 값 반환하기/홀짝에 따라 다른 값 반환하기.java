class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        } else {
            for (int i = n; i > 0; i -= 2) {
                answer += i;
            }
        }
        
        
        return answer;
    }
}

/*
n이 홀수면 그 이하 홀수의 합 return
n이 짝수면 그 이하 짝수들의 각 제곱의 합 return
*/