import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(factorial(sc.nextInt()));
    }
    private static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n-1);
    }
}
/*
    접근 방법:
    팩토리얼의 정의인 n! = n × (n-1)!을 그대로 재귀함수로 구현하였다.

    n이 1이 되면 1을 반환하여 재귀 호출을 종료하고,
    그렇지 않으면 현재 n과 factorial(n - 1)의 결과를 곱한다.

    예를 들어 factorial(4)는 다음과 같이 동작한다.

    factorial(4)
    = 4 * factorial(3)
    = 4 * 3 * factorial(2)
    = 4 * 3 * 2 * factorial(1)
    = 4 * 3 * 2 * 1
    = 24

    코드 리뷰(GPT):
    올바른 재귀 풀이이다.

    종료 조건과 재귀식이 명확하며 불필요한 상태 변수도 없다.

    시간복잡도: O(n)
    공간복잡도: O(n) - 재귀 호출 스택
*/