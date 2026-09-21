import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gcd(sc.nextInt(), sc.nextInt());
    }

    public static void gcd(int a, int b) {
        int gcd = 1;
        int max = a > b ? b : a;
        
        for (int cnt = max; cnt > 0; cnt--) {
            if (a % cnt == 0 && b % cnt == 0) {
                gcd = cnt;
                break;
            }
        }
        System.out.print(gcd);
    }
}
/*
    두 수 중 더 작은 값부터 1씩 감소시키면서
    두 수를 모두 나누어 떨어뜨리는 가장 큰 공약수를 찾는 방식으로 구현하였다.

    코드 리뷰(GPT):

    현재 코드는 정상적으로 동작한다.

    두 수의 최대공약수는 두 수 중 작은 값보다 클 수 없으므로
    작은 값부터 역순으로 탐색하는 접근이 맞다.

    처음으로

        a % cnt == 0 && b % cnt == 0

    을 만족하는 cnt가 최대공약수이므로
    바로 break 하는 것도 적절하다.

    다만

        int max = a > b ? b : a;

    는 실제로 두 수 중 작은 값을 저장하므로
    변수명을 min으로 바꾸는 것이 의미상 더 명확하다.

    또한 gcd의 초기값을 1로 둘 필요 없이
    조건을 만족하는 순간 바로 출력하거나 return 해도 된다.

    시간복잡도는 최악의 경우 O(min(a, b))이다.
*/