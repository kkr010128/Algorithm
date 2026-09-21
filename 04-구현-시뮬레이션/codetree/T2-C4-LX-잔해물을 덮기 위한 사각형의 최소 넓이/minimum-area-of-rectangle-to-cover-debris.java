import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;
    static int [][] grid = new int[2002][2002];
    static int ancX1, ancY1, ancX2, ancY2;
    static int maxWidth = 0;
    static int maxHeight = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        assignSquare(true, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
        assignSquare(false, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET, sc.nextInt()+OFFSET);
        getMax();
        System.out.print(maxWidth * maxHeight);
    }

    private static void getMax() {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int x = ancX1; x < ancX2; x++) {
            for (int y = ancY1; y < ancY2; y++) {
                if (grid[x][y] == 1) {
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        if (minX == Integer.MAX_VALUE) {
            maxWidth = 0;
            maxHeight = 0;
            return;
        }

        maxWidth = maxX - minX + 1;
        maxHeight = maxY - minY + 1;
    }

    private static void assignSquare(boolean isAssign, int x1, int y1, int x2, int y2) {
        if (isAssign) {
            ancX1 = x1; ancY1 = y1; ancX2 = x2; ancY2 = y2;
            
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    grid[i][j] = 1;
                }
            }
        }
        else {
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    grid[i][j] = 2;
                }
            }
        }
    }
}
/*
    접근 방법:
    첫 번째 직사각형 영역을 grid에 1로 표시하고,
    두 번째 직사각형 영역을 2로 덮어써서 가려진 영역을 제거하였다.

    이후 첫 번째 직사각형의 범위만 다시 순회하면서
    값이 1로 남아 있는 좌표들의 최소/최대 x, y를 구하고,
    남아 있는 영역을 모두 포함하는 최소 직사각형의 넓이를 계산하였다.

    OFFSET을 사용해 음수 좌표를 배열의 양수 인덱스로 변환한 것도 적절하다.

    코드 리뷰(GPT):
    현재 풀이는 정상적인 격자 시뮬레이션 방식이다.
    좌표 범위가 충분히 작다면 구현이 직관적이고 안전하다.

    getMax()에서 maxX - minX + 1, maxY - minY + 1을 사용하는 이유는
    grid[x][y] 하나가 좌표의 점이 아니라 1 x 1 크기의 칸을 의미하기 때문이다.

    예를 들어 x = 3, 4인 두 칸이 남았다면
    너비는 4 - 3이 아니라 2이므로 +1이 필요하다.

    첫 번째 직사각형이 완전히 가려진 경우에는
    minX가 갱신되지 않는 것을 이용해 넓이를 0으로 처리한 것도 적절하다.

    개선점:
    1. main()의 x1, y1, x2, y2 변수는 선언만 하고 사용하지 않으므로 제거할 수 있다.

    2. maxWidth, maxHeight는 getMax()에서만 계산되고 마지막에 한 번 사용된다.
       따라서 전역 변수로 둘 필요 없이 getArea()가 넓이를 직접 반환하도록 만들면
       데이터의 범위가 줄어들어 코드가 더 단순해진다.

    3. assignSquare()의 boolean 매개변수는 호출부만 보면
       true와 false가 무엇을 의미하는지 바로 알기 어렵다.
       fillFirstSquare(), coverSquare()처럼 역할별 메서드로 분리하거나
       채울 값을 직접 전달하는 방식이 더 명확하다.

    시간복잡도:
    첫 번째 직사각형 넓이를 A, 두 번째 직사각형 넓이를 B라고 하면
    영역 표시 O(A + B), 남은 영역 탐색 O(A)이므로 전체는 O(A + B)이다.

    공간복잡도:
    2002 x 2002 크기의 int 배열을 사용하므로 O(2002^2),
    약 400만 개의 int를 저장하여 grid 자체가 약 16MB를 사용한다.
*/