import java.util.Scanner;

public class Main {
    static int n;
    static int cnt = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print(getValue(2, 4));
    }

    private static int getValue(int prev1, int prev2) {
        cnt++;
        if (n == 1) return 2;
        if (n == 2) return 4;
        int newPrev = (prev1 * prev2) % 100;
        if (cnt == n) return newPrev;
        else return getValue(prev2, newPrev);
    }
}

/*
    접근 방법:
    첫 번째 항 2와 두 번째 항 4를 재귀함수의 매개변수로 전달하고,
    현재까지 2번째 항까지 존재하므로 cnt를 2에서 시작하였다.

    매 호출마다
    (이전 두 항의 곱) % 100
    으로 다음 항을 계산하고,

    cnt가 N과 같아지면 계산한 값을 반환한다.

    코드 리뷰(GPT):
    현재 로직은 N번째 항을 정확히 구한다.

    다만 cnt++가 함수 시작 부분에 있어서
    n == 1 또는 n == 2인 경우에도 cnt가 먼저 증가한다.
    결과값에는 영향을 주지 않지만 흐름상 자연스럽지는 않다.

    종료 조건을 먼저 처리하고 그 다음 cnt를 증가시키는 편이
    재귀의 상태를 이해하기 쉽다.

    또한 else는 생략할 수 있다.
*/