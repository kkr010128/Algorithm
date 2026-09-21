class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
/*
my_string 들어오면 n 만큼만 문자열로 반환
.charAt(i)로 새로운 문자열에 붙이면 될듯
n은 my_string보다 같거나 작으므로 out of bounds 무시
*/