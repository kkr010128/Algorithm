import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(fib(sc.nextInt()));
    }
    private static int fib(int n ) {
        if(n == 1 || n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }
}
/*
    n번째 피보나치 수를 구하는 재귀 함수로 구현하였다.

    코드 리뷰(GPT):
    현재 풀이가 문제 요구사항에 정확히 맞는다.

    fib(n)의 의미를 "n번째 피보나치 수"로 정의하고,
    첫 번째와 두 번째 항이 모두 1이므로
    n == 1 또는 n == 2일 때 1을 반환한다.

    그 외에는 피보나치 수열의 정의 그대로
        fib(n) = fib(n - 1) + fib(n - 2)
    를 재귀적으로 계산한다.

    재귀 문제에서는 현재처럼
    1. 함수의 의미를 정하고
    2. 종료 조건을 만들고
    3. 더 작은 동일한 문제로 표현하는 방식
    으로 접근하면 된다.

    시간복잡도: O(2^N)
    공간복잡도: O(N) - 재귀 호출 스택
*/