import java.util.Scanner;

public class Main {

    public static void printStars(int n) {
        if (n == 0) {
            return;
        }

        printStars(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printStars(n);
    }
}

/*
    재귀 함수로 1개부터 N개까지 별을 출력하는 문제이다.

    printStars(n)에서 바로 별을 출력하지 않고
    printStars(n - 1)을 먼저 호출한다.

    따라서 n이 0이 될 때까지 재귀 호출이 진행된 후,
    함수가 반환되는 순서대로 1개, 2개, ..., n개의 별이 출력된다.

    예를 들어 n = 3이면 호출 순서는 다음과 같다.

    printStars(3)
    → printStars(2)
    → printStars(1)
    → printStars(0)

    이후 반환되면서 다음과 같이 출력된다.

    *
    **
    ***

    코드 리뷰(GPT):
    재귀 함수의 호출과 반환 순서를 이용한 적절한 풀이이다.

    종료 조건인 n == 0이 존재하므로 무한 재귀가 발생하지 않으며,
    재귀 호출을 별 출력보다 먼저 배치하여 별의 개수가 증가하는 순서로 출력된다.

    별을 총 1 + 2 + ... + N개 출력하므로 시간복잡도는 O(N²)이고,
    재귀 호출의 깊이가 N이므로 공간복잡도는 O(N)이다.
*/