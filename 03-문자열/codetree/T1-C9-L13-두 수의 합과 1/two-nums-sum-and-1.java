import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + sc.nextInt();
        String num = Integer.toString(a);
        int cnt = 0;

        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') cnt++;
        }
        System.out.print(cnt);
    }
}
/*
    두 정수를 더한 뒤 결과를 문자열로 변환하여
    각 자릿수를 순회하면서 숫자 '1'의 개수를 세는 방식으로 구현하였다.

    문자열로 변환했기 때문에 각 자릿수를 쉽게 비교할 수 있으며,
    '1'인 경우에만 개수를 증가시켜 결과를 출력하였다.

    코드 리뷰(GPT):

    현재 접근이 가장 적절하다.
    문자열을 한 번만 순회하므로 시간복잡도는 O(N)이다.

    숫자를 문자열로 변환하여 각 자릿수를 비교했기 때문에
    별도의 나눗셈이나 나머지 연산 없이 구현을 간결하게 작성할 수 있었다.

    물론 다음과 같이 산술 연산만으로도 해결할 수 있다.

        while (a > 0) {
            if (a % 10 == 1) cnt++;
            a /= 10;
        }

    하지만 이 문제에서는 문자열을 이용한 현재 풀이가
    의도가 명확하고 가독성도 좋아 충분히 적절한 구현이다.
*/