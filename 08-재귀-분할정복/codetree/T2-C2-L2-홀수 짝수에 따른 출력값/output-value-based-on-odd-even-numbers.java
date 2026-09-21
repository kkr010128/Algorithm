import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = (n % 2 == 0) ? even(n) : odd(n);
        System.out.print(result);
    }
    
    public static int even(int n) {
        if (n <= 2) return 2;
        return n + even(n-2);
    }
    
    public static int odd(int n) {
        if (n <= 1) return 1;
        return n + odd(n-2);
    }
    
}
/*
    접근 방법:
    입력값 N이 짝수인지 홀수인지 먼저 판단한 뒤,
    같은 홀짝성을 가진 수만 재귀적으로 더하는 방식으로 구현하였다.

    짝수인 경우:
    N + (N - 2) + (N - 4) + ... + 2

    홀수인 경우:
    N + (N - 2) + (N - 4) + ... + 1

    코드 리뷰(GPT):
    현재 구현은 올바르다.

    n에서 2씩 감소시키므로 짝수는 끝까지 짝수,
    홀수는 끝까지 홀수로 유지된다.

    따라서 even()과 odd()의 종료 조건을 각각 2와 1로 두는 것도 적절하다.

    다만 두 함수의 재귀 구조가 거의 동일하므로 하나의 함수로 합칠 수도 있지만,
    짝수와 홀수의 처리를 구분하는 학습 문제라면 현재 방식이 더 직관적이다.

    시간복잡도: O(n)
    공간복잡도: O(n) - 재귀 호출 스택
*/
