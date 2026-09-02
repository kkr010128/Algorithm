import java.util.*;

class Tile {
    int color; // 1: white, 2: black, 3: gray
    int white;
    int black;
}

public class Main {

    static final int OFFSET = 100000;
    static final int SIZE = 200001;

    static Tile[] tiles = new Tile[SIZE];
    static int ptr = OFFSET;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                moveLeft(x);
            } else {
                moveRight(x);
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for (Tile tile : tiles) {
            if (tile == null) continue;

            if (tile.color == 1) {
                white++;
            } else if (tile.color == 2) {
                black++;
            } else if (tile.color == 3) {
                gray++;
            }
        }

        System.out.printf("%d %d %d", white, black, gray);
    }

    private static void moveRight(int x) {
        for (int i = 0; i < x; i++) {
            paint(ptr, 2);

            if (i < x - 1) {
                ptr++;
            }
        }
    }

    private static void moveLeft(int x) {
        for (int i = 0; i < x; i++) {
            paint(ptr, 1);

            if (i < x - 1) {
                ptr--;
            }
        }
    }

    private static void paint(int index, int color) {
        if (tiles[index] == null) {
            tiles[index] = new Tile();
        }

        Tile tile = tiles[index];

        if (tile.color == 3) {
            return;
        }

        if (color == 1) {
            tile.white++;
        } else {
            tile.black++;
        }

        if (tile.white >= 2 && tile.black >= 2) {
            tile.color = 3;
        } else {
            tile.color = color;
        }
    }
}
/*
    좌표가 음수가 될 수 있으므로 OFFSET을 적용한 배열을 사용하고,
    각 위치마다 Tile 객체를 저장하는 방식으로 구현했다.

    Tile 객체는 다음 정보를 관리한다.

        color
        - 1: 흰색
        - 2: 검은색
        - 3: 회색

        white
        - 흰색으로 칠해진 횟수

        black
        - 검은색으로 칠해진 횟수

    moveRight(), moveLeft()에서는 현재 위치의 타일부터 포함하여
    총 x개의 타일을 칠한다.

    중요한 점은 x개의 타일을 칠했을 때 실제 위치 이동은 x - 1이라는 것이다.

    예를 들어

        4 R

    이라면

        0, 1, 2, 3

    총 4개의 타일을 칠하고 최종 위치는 3이 된다.

    따라서 반복문 안에서 마지막 타일을 칠한 뒤에는 이동하지 않는다.

        if (i < x - 1) {
            ptr++;
        }

    왼쪽도 동일하게 처리한다.

    코드 리뷰(GPT):
    문제의 조건을 잘 반영한 풀이이다.

    특히 paint()로 칠하기 로직을 분리한 점이 좋다.

    paint()에서는 먼저 해당 위치의 Tile 객체가 없다면 생성한다.

        if (tiles[index] == null) {
            tiles[index] = new Tile();
        }

    이후 이미 회색인 경우에는

        if (tile.color == 3) {
            return;
        }

    으로 더 이상 색상과 횟수를 변경하지 않는다.

    문제에서 회색이 된 타일은 더 이상 바뀌지 않는다고 했으므로
    이 처리가 정확하다.

    흰색 또는 검은색으로 칠할 때 해당 횟수를 증가시킨 뒤

        tile.white >= 2 && tile.black >= 2

    를 만족하면 회색으로 만든다.

    그렇지 않으면 마지막으로 칠한 색을 유지한다.

    따라서

        흰색 1회 → white
        검은색 1회 → black
        흰색 2회 + 검은색 1회 → 마지막 색
        흰색 2회 + 검은색 2회 → gray

    와 같은 문제 조건을 그대로 표현한다.

    OFFSET = 100000으로 잡은 이유는
    최대 N = 1000, 한 번의 최대 이동 거리 x = 100이므로
    한쪽 방향으로 이동할 수 있는 최대 거리가 약 100000이기 때문이다.

    실제 이동량은 각 명령마다 x - 1이지만
    100000 정도의 여유를 두면 충분히 안전하게 좌표를 배열 인덱스로 변환할 수 있다.

    시간복잡도:
    모든 명령에서 실제로 칠하는 타일 수의 합을 D라고 하면 O(D)

    제한상 최대 약 1000 * 100 = 100000이므로 충분하다.

    마지막 배열 순회는 O(SIZE) = O(200001)이므로 역시 충분하다.

    공간복잡도:
    Tile 배열 크기에 비례하므로 O(SIZE)

    이전 ArrayList + indexOf 방식보다
    좌표를 배열 인덱스로 바로 접근하므로 훨씬 효율적이다.

    ArrayList.indexOf()는 매번 O(n)이지만
    현재 방식의 tiles[index] 접근은 O(1)이다.
*/