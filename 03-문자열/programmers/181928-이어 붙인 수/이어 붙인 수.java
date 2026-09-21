class Solution {
    public int solution(int[] num_list) {
        String oddsum = "";
        String evensum = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                evensum += num_list[i];
            } else {
                oddsum += num_list[i];
            }
        }
        
        int answer = Integer.parseInt(oddsum) + Integer.parseInt(evensum);
        return answer;
    }
}
/*
num_list 받으면 value가 홀수인 문자열합과 짝수인 value의 문자열합을 반환
배열을 순회하며 순회중인 value의 홀짝에 따라 합산
*/