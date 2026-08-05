import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String s = sb.toString();
        int n = sc.nextInt();
        int q;

        for (int i = 0; i < n; i++) {
            q = sc.nextInt();

            if (q == 1) { // 왼쪽 시프트
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
            }

            else if (q == 2) { // 오른쪽 시프트
                sb.insert(0, sb.charAt(sb.length() -1));
                sb.deleteCharAt(sb.length()- 1);
            }

            else { // 문자열 뒤집기
                sb.reverse();
            }

            System.out.println(sb);
        }
    }
}

/*
    처음 고려한 접근
    - StringBuilder의 append(), deleteCharAt(), insert()를 이용해 문자열을 직접 회전시키는 방식으로 구현했다.
    - 처음에는 deleteCharAt(charAt(0))을 사용했지만, deleteCharAt()은 인덱스를 받기 때문에 문자 코드값을 인덱스로 사용하여 오류가 발생했다.

    GPT 리뷰
    - 현재 구현은 각 명령마다 O(문자열 길이)이며, 문제 요구사항을 만족한다.
    - String s는 이후 사용하지 않으므로 제거해도 된다.
    - q는 반복문 안에서 선언해도 된다.
    - append() 후 deleteCharAt(0), insert() 후 deleteCharAt(length - 1) 순서도 올바르다.
*/