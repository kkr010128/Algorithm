/*
    Lesson 4. 사각형 칠하기

    # 계속 중첩되는 사각형

    좌표평면에 N개의 직사각형을 입력 순서대로 칠한다.
    첫 번째 직사각형부터 빨간색과 파란색을 번갈아 사용하며,
    겹치는 영역은 가장 마지막에 칠한 직사각형의 색으로 덮어쓴다.
    모든 직사각형을 칠한 뒤 파란색 영역의 총 넓이를 구한다.

    # 입력

    첫 번째 줄에 직사각형의 개수 N이 주어진다.
    이후 N개의 줄에 각 직사각형의 좌측 하단 좌표 x1, y1과
    우측 상단 좌표 x2, y2가 주어진다.

    # 제한 조건

    - 1 <= N <= 10
    - -100 <= x1 < x2 <= 100
    - -100 <= y1 < y2 <= 100
    - 모든 입력값은 정수이다.

    # 출력

    모든 직사각형을 칠한 뒤 파란색 영역의 총 넓이를 출력한다.

    # 예제 입력 1

    2
    2 1 7 4
    5 -1 10 3
*/
import java.util.Scanner;

public class Main {
    static boolean [][] grid = new boolean [202][202];
    static final int OFFSET = 100;
    static boolean isRed = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            assignSquare(isRed, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
            isRed = isRed ? false : true;
        }
        System.out.print(getBlueArea());
    }

    private static void assignSquare(boolean isRed, int x1, int y1, int x2, int y2) {
        if(isRed) {
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    grid[y][x] = false;
                }
            }
        }
        else {
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    grid[y][x] = true;
                }
            }
        }
    }

    private static int getBlueArea() {
        int countBlue = 0;
        for (int y = 0; y < 201; y++) {
            for (int x = 0; x < 201; x++) {
                if (grid[y][x]) countBlue++;
            }
        }
        return countBlue;
    }
}
/*
    좌표에 OFFSET을 더해 음수 좌표를 배열의 인덱스로 변환하고,
    boolean 2차원 배열의 각 칸에 현재 색상을 덮어쓰는 방식으로 해결했다.

    빨간색은 false, 파란색은 true로 표현한다.
    직사각형이 입력될 때마다 해당 범위의 모든 칸을 현재 색상으로 변경하므로,
    여러 직사각형이 겹쳐도 가장 마지막에 입력된 직사각형의 색상이 남는다.
    마지막에는 grid에서 true인 칸의 개수를 세어 파란색 영역의 넓이를 구한다.

    코드 리뷰(GPT):
    현재 풀이는 문제의 조건을 정확하게 처리하며 정답이다.
    좌표 범위가 -100부터 100까지로 작기 때문에 각 단위 영역을 배열로 직접 관리하는 방식도 적절하다.

    assignSquare()에서는 빨간색과 파란색일 때 반복문이 완전히 중복되고
    대입하는 값만 다르므로 하나로 합칠 수 있다.

        for (int y = y1; y < y2; y++) {
            for (int x = x1; x < x2; x++) {
                grid[y][x] = !isRed;
            }
        }

    색상을 번갈아 변경하는 부분도 삼항 연산자 대신 다음처럼 작성할 수 있다.

        isRed = !isRed;

    grid는 202 x 202로 선언했지만 실제 좌표는 OFFSET 적용 후 0부터 200까지 사용하므로
    getBlueArea()에서 0부터 200까지 검사하는 현재 범위는 문제 조건에 맞다.
    따라서 index 201은 사용할 필요가 없으며 배열 크기도 201 x 201이면 충분하다.

    각 직사각형의 최대 넓이가 200 x 200이고 N <= 10이므로
    시간복잡도는 O(N * 200^2)이고,
    공간복잡도는 O(200^2)이다.
*/