import java.util.Scanner;

public class Main {
    private static int n;
    private static int max = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();
        System.out.print(compare(n));
    }
    private static int compare(int cnt) {
            if (cnt == 0) return max;
            int num = sc.nextInt();
            if (num > max) max = num;
            return compare(cnt-1);
    }
}

/*
    접근 방법:
    재귀함수의 매개변수 cnt를 아직 입력받아야 하는 숫자의 개수로 사용했다.

    compare()가 호출될 때마다 숫자를 하나 입력받아 현재 max와 비교하고,
    더 큰 값이면 max를 갱신한다.

    이후 compare(cnt - 1)을 호출하고,
    cnt가 0이 되면 모든 숫자를 확인한 것이므로 max를 반환한다.

    코드 리뷰(GPT):
    재귀를 이용해 N개의 수를 한 번씩 확인하므로 시간복잡도는 O(n)이다.
    재귀 호출이 n번 쌓이므로 공간복잡도는 O(n)이다.

    문제의 제한 조건이 1 <= Ai <= 100이므로
    max를 0으로 초기화해도 문제가 없다.

    다만 n은 main()에서 compare()에 전달하는 용도로만 사용하므로
    static 필드로 둘 필요 없이 지역 변수로 선언할 수 있다.

    재귀 조건과 최댓값 갱신 로직은 적절하다.
*/
