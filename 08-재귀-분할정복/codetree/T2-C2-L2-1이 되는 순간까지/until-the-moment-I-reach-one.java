import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(recursion(n));
    }

    public static int recursion(int n) {
        int cnt = 0;
        if(n == 1) return cnt;
        if(n % 2 == 0) {
            cnt++;
            return cnt + recursion(n/2);
        } else {
            cnt++;
            return cnt + recursion(n/3);
        }
    }
}

/*
    n이 1이 될 때까지 재귀적으로 값을 줄이면서
    각 재귀 호출마다 작업 횟수를 1씩 더하는 방식으로 구현하였다.

    코드 리뷰(GPT):
    접근 방법과 결과 모두 올바르다.

    다만 cnt는 재귀 함수가 호출될 때마다 항상 0으로 새로 생성되고,
    실제로는 각 단계에서 한 번의 작업만 수행하므로 사용할 필요가 없다.

    현재 코드의
        cnt++;
        return cnt + recursion(...);
    는 결국
        return 1 + recursion(...);
    과 동일하다.

    종료 조건에서 작업 횟수는 0이므로 n == 1일 때 0을 반환하면 된다.

    시간복잡도: O(log N)
    공간복잡도: O(log N)
*/
