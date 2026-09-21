import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String cmpTo = sc.next();
        int cnt = 0;
        int failed = 0;
        while(true) {
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
            cnt++;
            if(sb.toString().equals(cmpTo)) break;
            failed++;
            if(failed == cmpTo.length()) {
                cnt = -1;
                break;
            }
        }
        System.out.print(cnt);
    }
}

/*
    문자열 A의 마지막 문자를 맨 앞으로 이동시키는 방식으로
    오른쪽 회전을 반복하고, 문자열 B와 같아지는 최소 횟수를 구하였다.

    한 번 회전할 때마다 cnt를 증가시키고,
    문자열 길이만큼 회전해도 일치하지 않으면 -1을 출력하도록 구현하였다.

    코드 리뷰(GPT):

    문제에서 문자열 A와 B는 항상 다르다고 보장하므로,
    처음부터 같은 문자열인 경우를 별도로 검사할 필요는 없다.

    현재 회전 방식은 정상적으로 동작한다.

        sb.insert(0, sb.charAt(sb.length() - 1));
        sb.deleteCharAt(sb.length() - 1);

    예를 들어 "abc"에서 마지막 문자 'c'를 앞에 삽입하면 "cabc"가 되고,
    이후 마지막 인덱스의 'c'가 아닌 기존 문자열의 마지막 위치에 밀려난 문자를
    삭제하여 최종적으로 "cab"이 된다.

    다만 failed와 cnt는 사실상 회전 횟수를 함께 세고 있어
    하나의 변수만 사용해도 충분하다.

    또한 매 반복마다

        sb.toString()

    으로 새로운 String 객체를 생성한다.
    입력 길이가 최대 100이므로 성능상 문제는 없지만,
    코드의 목적을 단순화하려면 문자열 이어 붙이기를 이용할 수도 있다.

    StringBuilder의 insert(0, ...)는 기존 문자를 모두 뒤로 이동시키므로 O(N)이고,
    이를 최대 N번 반복하므로 전체 시간복잡도는 O(N²)이다.
    현재 제한에서는 충분히 통과할 수 있다.
*/