import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        inc(1, n);
        System.out.println();
        dec(n);
    }

    private static void inc(int i, int n) {
        if (i > n) return;

        System.out.printf("%d ", i);
        inc(i + 1, n);
    }

    private static void dec(int i) {
        if (i < 1) return;

        System.out.printf("%d ", i);
        dec(i - 1);
    }
}
/*
    재귀함수를 이용하여 1부터 N까지 증가하는 수열과
    N부터 1까지 감소하는 수열을 출력하였다.

    inc()는 현재 값 i와 종료 기준 n을 전달하고,
    재귀 호출마다 i + 1을 넘겨 1부터 N까지 출력한다.

    dec()는 N부터 시작하여 재귀 호출마다 i - 1을 넘기고,
    i가 1보다 작아지면 재귀를 종료한다.

    코드 리뷰(GPT):
    현재 방식이 적절하다.

    각 재귀 호출에서 i의 값이 종료 조건을 향해 변화하므로
    무한 재귀가 발생하지 않는다.

    inc()는 최댓값 n이 필요하므로 두 개의 인자를 사용하지만,
    dec()는 1이라는 고정된 종료 기준을 사용하므로 n을 추가로 전달할 필요가 없다.

    두 함수 모두 N번 호출되므로 시간복잡도는 O(N)이며,
    재귀 호출 스택을 사용하므로 공간복잡도는 O(N)이다.
*/