import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;
        
        for(int i = a; i <= b; i++) {
            if(isPrime(i)) sum += i;
        }
        System.out.print(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
/*
    a부터 b까지의 수를 하나씩 확인하면서,
    소수인 경우에만 sum에 더하는 방식이다.

    제한 조건이 2 <= a <= b <= 100이므로
    isPrime()에 0, 1에 대한 예외 처리는 필요하지 않다.

    코드 리뷰(GPT):
    현재 코드는 정상적으로 동작하고,
    문제의 입력 범위에서는 성능도 충분하다.

    isPrime()에서 2부터 n - 1까지 모든 수로 나누어 보면서
    하나라도 나누어떨어지면 false를 반환하고,
    끝까지 나누어떨어지지 않으면 true를 반환하는 구조도 적절하다.

    다만 소수 판별은 제곱근까지만 검사해도 되므로
    일반적인 구현에서는 다음처럼 개선할 수 있다.

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }

    하지만 b <= 100인 현재 문제에서는
    기존 방식 그대로 사용해도 충분하다.

    시간복잡도는 현재 구현 기준 대략 O((b - a + 1) * b)이다.
*/