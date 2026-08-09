import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        System.out.print(isLeap(y));
    }

    public static boolean isLeap(int y) {
        if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) return false;
        return true;
    }
}/*
    입력받은 연도가 윤년인지 판별하는 방식이다.

    윤년 조건은 다음과 같다.
    - 4의 배수이면서
    - 100의 배수는 아니거나
    - 400의 배수인 경우

    현재 코드는 반대로 "윤년이 아닌 조건"을 먼저 검사하여
    해당하면 false를 반환하고, 나머지는 true를 반환한다.

    코드 리뷰(GPT):
    현재 코드는 정상적으로 동작한다.

    if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) return false;

    조건식도 정확하다.

    조금 더 직접적으로 작성하면 다음과 같이 표현할 수 있다.

    public static boolean isLeap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }

    두 방식 모두 맞으며,
    현재 작성한 방식도 충분히 읽기 좋다.

    시간복잡도는 O(1), 공간복잡도는 O(1)이다.
*/