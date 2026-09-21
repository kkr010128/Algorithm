import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        System.out.printf("%d", Integer.parseInt(a+b) + Integer.parseInt(b+a));
    }
}
/*
    두 개의 문자열을 입력받아

        A + B
        B + A

    형태로 이어 붙인 문자열을 각각 정수로 변환한 뒤,
    두 값을 더하여 출력하는 방식으로 구현하였다.

    문자열 결합을 먼저 수행한 후 Integer.parseInt()를 이용해
    정수로 변환하였기 때문에 별도의 자리수 계산이 필요 없다.

    코드 리뷰(GPT):

    현재 방식이 가장 적절하다.
    문자열 결합과 정수 변환만 수행하므로 구현이 간결하며,
    시간복잡도는 문자열 길이를 N이라 할 때 O(N)이다.

    다만 Integer.parseInt()는 int 범위를 초과하는 값이 입력되면
    NumberFormatException이 발생한다.

    문제에서 입력 범위가 커질 가능성이 있다면

        Long.parseLong()

    을 사용하는 것이 더 안전하다.

    또한 변수명을

        a, b

    보다는

        first, second

    처럼 의미 있게 작성하면 코드의 의도가 더 명확해진다.
*/