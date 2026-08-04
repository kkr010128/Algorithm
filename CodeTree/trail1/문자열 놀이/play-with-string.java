import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int n = sc.nextInt();
        int a, b;
        char x, y, tmp;
        int query;

        for (int i = 0; i < n; i++) {
            query = sc.nextInt();
            if (query == 1) {
                a = sc.nextInt() - 1;
                b = sc.nextInt() - 1;
                tmp = sb.charAt(a);
                sb.setCharAt(a, sb.charAt(b));
                sb.setCharAt(b, tmp);
                System.out.println(sb.toString());
            }
            else if (query == 2) {
                x = sc.next().charAt(0);
                y = sc.next().charAt(0);
                for (int j = 0; j < sb.length(); j++) {
                    if (sb.charAt(j) == x) sb.setCharAt(j, y);
                }
                System.out.println(sb.toString());
            }
        }
    }
}
/*
    문자열의 문자를 직접 변경해야 하므로 StringBuilder를 사용하였다.

    1번 연산은 두 위치의 문자를 교환(Swap)하고,
    2번 연산은 문자열 전체를 순회하며 특정 문자를 다른 문자로 변경한다.

    StringBuilder는 문자 단위 수정(setCharAt)이 가능하므로
    문자열을 새로 생성하지 않고 효율적으로 처리할 수 있다.

    코드 리뷰(GPT):
    - StringBuilder 선택은 적절하다. String으로 처리하면 변경 시마다 새로운 객체가 생성된다.
    - query를 먼저 입력받아 연산을 분기한 구조도 가독성이 좋다.
    - Swap을 임시 변수(tmp)로 구현한 것도 가장 일반적인 방법이다.
    - 2번 연산은 문자열 전체를 순회해야 하므로 O(length)이며, 현재 방식이 적절하다.

    개선할 부분:
    - query가 1과 2만 들어온다면 else if 대신 else를 사용하는 것이 더 간결하다.

        if (query == 1) {
            ...
        } else {
            ...
        }

    - sb.toString()은 두 분기에서 모두 호출되므로 반복을 제거할 수 있다.

        if (...) {
            ...
        } else {
            ...
        }
        System.out.println(sb);

      StringBuilder는 println에서 자동으로 toString()이 호출된다.
*/