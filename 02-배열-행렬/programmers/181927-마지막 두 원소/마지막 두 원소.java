class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length +1]; // 원소를 추가하기 위한 새로운 배열 생성
        int lastIdx = num_list.length - 1;
        
        // 기존 배열의 원소들을 answer에 복사
        for(int i = 0; i < lastIdx + 1; i++) { 
            answer[i] = num_list[i];
        }
        
        // 조건에 따른 마지막 원소를 추가
        if(num_list[lastIdx] > num_list[lastIdx - 1]) {
            answer[num_list.length] = num_list[lastIdx] - num_list[lastIdx-1];
        } else {
            answer[num_list.length] = num_list[lastIdx] * 2;
        }
        
        return answer;
    }
}
// 리스트에서 마지막 원소가 바로 전 원소보다 크면
// answer에 {마지막 원소 - 그 전 원소} 원소를 추가해서 반환
// 아니라면
// answer에 {마지막 원소 * 2} 원소를 추가해서 반환

// 입력과 출력 모두 배열임
// 제한 사항에서 입력 배열의 최소 길이는 2 이상이므로 out of index는 고려하지 않음