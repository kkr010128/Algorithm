import java.util.Scanner;

public class Main {
    static int[][] grid = new int[202][202];
    static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int square = 0; square < n; square++) {
            assignSquare(sc.nextInt(), sc.nextInt());
        }

        int sum = 0;
        
        for (int i = 0; i < 202; i++) {
            for (int j = 0; j < 202; j++) {
                if (grid[i][j] > 0) sum++;
            }
        }
        System.out.print(sum);
    }

    private static void assignSquare(int x, int y) {
        x += OFFSET;
        y += OFFSET;

        for (int i = x; i < x+8; i++) {
            for (int j = y; j < y+8; j++) {
                grid[i][j] += 1;
            }
        }
    }
}
/*
    접근 방법:
    좌표 범위가 -100 ~ 100이고 각 색종이의 크기가 8 × 8로 고정되어 있으므로,
    2차원 배열을 좌표평면처럼 사용하는 방식으로 구현하였다.

    음수 좌표를 배열의 인덱스로 사용할 수 없기 때문에
    모든 좌표에 OFFSET = 100을 더해 양수 인덱스로 변환하였다.

    각 색종이의 좌측 하단 좌표 (x, y)를 기준으로
    [x, x + 8), [y, y + 8) 범위를 순회하며 해당 영역을 표시하였다.

    모든 색종이를 표시한 뒤 배열 전체를 순회하면서
    한 번이라도 색종이가 덮인 칸(grid[i][j] > 0)의 개수를 세었다.
    각 배열의 한 칸은 넓이 1인 단위 정사각형이므로,
    이 개수가 겹치는 부분을 한 번만 포함한 전체 넓이가 된다.

    코드 리뷰(GPT):
    현재 풀이는 문제 조건에 잘 맞는 방식이다.
    색종이가 겹치더라도 grid 값을 증가시키고 마지막에 0보다 큰지만 확인하므로
    겹치는 영역이 여러 번 넓이에 포함되지 않는다.

    다만 실제로 필요한 정보는 "몇 장이 겹쳤는가"가 아니라
    "한 번이라도 칠해졌는가"이므로 int[][] 대신 boolean[][]을 사용하는 것도 가능하다.

        grid[i][j] = true;

    이후 true인 칸만 세면 된다.

    현재 int 배열 방식도 정답에는 문제가 없으며,
    이후 겹친 횟수까지 활용하는 문제로 확장한다면 오히려 현재 구조가 더 유용하다.

    또한 8과 202도 의미가 있는 값이므로 상수로 분리하면 코드의 의도가 더 명확해진다.

    시간복잡도:
    색종이 N장에 대해 각각 8 × 8 영역을 칠하므로 O(N × 64),
    마지막 배열 탐색은 O(202²)이다.
    따라서 전체적으로 O(N + 202²) 수준이다.

    공간복잡도:
    202 × 202 크기의 2차원 배열을 사용하므로 O(202²)이다.
*/