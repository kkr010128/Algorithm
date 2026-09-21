class Solution {
    public int[] solution(int[] num_list, int n) {
        
        if(n < num_list.length) {
            int[] answer = new int[num_list.length + 1 - n];
            int idx = n - 1;
            
            for(int i = 0; i < answer.length; i++) {
                answer[i] = num_list[idx];
                idx++;
            }
            return answer;
        } else {
            int[] answer = {num_list[n-1]};
            return answer;
        }
    }
}

/*
정수 배열과 정수가 주어짐
주어진 정수는 idx+1을 의미
마지막 원소까지 모든 원소를 담은 배열을 새로 만들어서 반환
정답 배열 크기 = 
1. n == 입력배열크기 -> 1
2. n < 입력배열크기 -> 입력배열크기+1 - n
정답 배열을 조건문 안에서 선언하고 만들어서 반환해줘도 될 거 같음
*/