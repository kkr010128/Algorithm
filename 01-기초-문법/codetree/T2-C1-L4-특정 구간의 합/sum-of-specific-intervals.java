import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            System.out.println(getSum(arr, a1, a2));
        }
    }

    public static int getSum(int[] arr, int a1, int a2) {
        int sum = 0;

        for (int i = a1 - 1; i <= a2 - 1; i++) {
            sum += arr[i];
        }

        return sum;
    }
}

/*
    배열과 M개의 구간 (a1, a2)을 입력받은 뒤,
    각 구간마다 a1번째 원소부터 a2번째 원소까지 순회하며 합을 구하는 방식이다.

    Java 배열은 0번부터 시작하지만 문제에서 주어지는 위치는 1번부터 시작하므로
    a1 - 1부터 a2 - 1까지 탐색한다.

    코드 리뷰(GPT):
    현재 풀이는 문제의 함수 사용 조건을 만족하며 구현도 적절하다.

    getSum()이 구간 합 계산만 담당하도록 분리되어 있어 역할도 명확하다.

    각 질의마다 최대 N개의 원소를 순회하므로 시간복잡도는 O(MN)이고,
    N, M <= 100이므로 충분히 빠르다.

    for문의 조건은 i <= a2 - 1 대신 i < a2로 작성하면 조금 더 간결하다.
*/