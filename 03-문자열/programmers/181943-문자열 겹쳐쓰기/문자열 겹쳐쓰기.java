class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int count = 0;
        for (int i = 0; i < s; i++) {
            count++;
            answer += my_string.charAt(i);
        }
        answer += overwrite_string;
        count += overwrite_string.length();
        for (int i = count; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
            count ++;
        }
        return answer;
    }
}


/*
int count = 0
answer += my_string.charAt(s-1)까지, count++
answer += overwrite_string, count++
int remain = my_string.length() - overwrite_string.length()
answer += my_string.charAt(count)를 my_string.length()까지

또 다른 방법은

count 변수 선언
idx 변수 선언
for 0부터 s-1까지 my_string 삽입, count++
for s부터 overwrite_string 전부 삽입, count ++
my_string 길이까지 남은 count만큼 my_string 삽입

반복문 (my_string.length())
    조건식 (idx가 s라면)
        반복문 (overwrite_string.length())
            answer에 + charAt(idx)
*/