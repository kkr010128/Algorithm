import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(isOnjeon(sc.nextInt(), sc.nextInt()));
    }

    public static int isOnjeon(int a, int b) {
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) continue;
            cnt++;
        }
        return cnt;
    }
}

/*
    사용자의 접근 방법:
    a부터 b까지 모든 정수를 순회하면서 조건에 해당하는 수를 제외하고,
    남은 수의 개수를 cnt로 계산하였다.

    코드 리뷰(GPT):
    전체적인 반복문 구조는 적절하며 시간복잡도는 O(b - a + 1)이다.

    다만 아래 조건은 중복이다.

    (i % 3 == 0 && i % 9 == 0)

    9의 배수라면 반드시 3의 배수이므로 다음과 동일하다.

    i % 9 == 0

    따라서 조건을 더 간결하게 작성할 수 있다.

    if (i % 2 == 0 || i % 10 == 5 || i % 9 == 0) continue;

    공간복잡도: O(1)
*/