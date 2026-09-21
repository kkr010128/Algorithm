class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            multiple = multiple * num_list[i];
            sum += num_list[i];
        }
        int answer = (multiple < sum * sum) ? 1 : 0;  
        return answer;
    }
}

/*
구해야 하는 것: 
1. 모든 원소들의 곱
2. 모든 원소들의 합의 제곱

반환: 곱이 제곱보다 작으면 1 아니면 0

곱과 합의제곱 변수를 각각 두고 for문 두개, 비교후 반환
또는
하나의 for문에서 한 idx마다 두 번의 연산 진행, 비교후 반환
*/