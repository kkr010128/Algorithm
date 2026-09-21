import java.util.Scanner;

public class Main {
    static int[][] grid = new int[2002][2002];
    static int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int square = 1; square <= 3; square++) {
            if (square == 3) assignSquare(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), true);
            else assignSquare(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), false);
        }

        int sum = 0;
        for (int i = 0; i < 2002; i++) {
            for (int j = 0; j < 2002; j++) {
                if (grid[i][j] == 1) sum += grid[i][j];
            }
        }
        System.out.print(sum);
    }

    private static void assignSquare(int x1, int y1, int x2, int y2, boolean isDelete) {
        x1 += OFFSET;
        x2 += OFFSET;
        y1 += OFFSET;
        y2 += OFFSET;

        for (int x = x1; x < x2; x++) {
            for (int y = y1; y < y2; y++) {
                if (isDelete) grid[x][y] = 0;
                else grid[x][y] = 1;
            }
        }
    }
}
/*
    접근 방법:
    좌표 범위가 -1000 ~ 1000이므로 2차원 배열을 좌표평면처럼 사용하였다.

    음수 좌표를 배열 인덱스로 사용할 수 없기 때문에
    모든 좌표에 OFFSET = 1000을 더해서 양수 인덱스로 변환하였다.

    직사각형 A와 B 영역은 1로 칠하고,
    마지막 직사각형 M 영역은 0으로 다시 덮었다.

    이후 배열 전체를 순회하면서 값이 1인 칸의 개수를 세어
    M에 가려지지 않은 A와 B의 넓이의 합을 구하였다.

    코드 리뷰(GPT):
    OFFSET을 상수로 설정하여 의미가 명확하다.
    assignSquare()로 사각형을 칠하는 로직을 분리한 구조도 적절하다.

    다만 현재 OFFSET은 변경되지 않는 값이므로
    static final int OFFSET = 1000; 으로 선언하는 것이 더 적절하다.

    또한 grid[i][j]는 0 또는 1만 저장하므로

        if (grid[i][j] == 1) sum += grid[i][j];

    는

        sum += grid[i][j];

    로 단순화할 수 있다.

    배열 크기 2002도 상수로 분리하면 매직 넘버를 줄일 수 있다.

    시간복잡도: O(N^2)
    공간복잡도: O(N^2)

    현재 좌표 범위에서는 약 400만 칸만 확인하므로 충분히 통과 가능한 방식이다.
*/