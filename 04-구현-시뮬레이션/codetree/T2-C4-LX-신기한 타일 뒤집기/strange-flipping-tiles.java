import java.util.*;

public class Main {

    static int ptr = 0;
    static int min = 0;
    static int max = 0;

    // false = 흰, true = 검
    static ArrayList<Boolean> tile = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 시작 위치 0번 타일
        tile.add(false);

        for (int i = 0; i < n; i++) {
            int moveCnt = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                moveLeft(moveCnt);
            } else {
                moveRight(moveCnt);
            }
        }

        printTileNum();
    }

    private static void moveLeft(int moveCnt) {
        for (int i = 0; i < moveCnt; i++) {

            // 현재 좌표가 기존 범위보다 왼쪽이면 새 타일 생성
            if (ptr < min) {
                tile.add(0, false);
                min = ptr;
            } else {
                int index = ptr - min;
                tile.set(index, false);
            }

            if (i < moveCnt - 1) {
                ptr--;
            }
        }
    }

    private static void moveRight(int moveCnt) {
        for (int i = 0; i < moveCnt; i++) {

            // 현재 좌표가 기존 범위보다 오른쪽이면 새 타일 생성
            if (ptr > max) {
                tile.add(true);
                max = ptr;
            } else {
                int index = ptr - min;
                tile.set(index, true);
            }

            if (i < moveCnt - 1) {
                ptr++;
            }
        }
    }

    private static void printTileNum() {
        int white = 0;
        int black = 0;

        for (boolean color : tile) {
            if (color) {
                black++;
            } else {
                white++;
            }
        }

        System.out.printf("%d %d", white, black);
    }
}
/*
    실제 좌표를 ptr로 관리하고,
    ArrayList 내부 인덱스는 ptr - min으로 변환해서 접근하는 방식으로 구현했다.

    왼쪽으로 기존 범위를 벗어나면

        tile.add(0, false);

    로 리스트 앞에 흰색 타일을 추가하고,

    오른쪽으로 기존 범위를 벗어나면

        tile.add(true);

    로 리스트 뒤에 검은색 타일을 추가한다.

    코드 리뷰(GPT):
    현재 코드는 문제 조건에 맞게 동작한다.

    특히 이전 코드에서 발생했던 핵심 문제인

        tile.set(ptr, ...)

    를 제거하고

        int index = ptr - min;

    으로 실제 좌표를 ArrayList 인덱스로 변환한 점이 중요하다.

    예를 들어

        min = -3
        ptr = 0

    이라면 실제 좌표 0의 리스트 인덱스는

        0 - (-3) = 3

    이 된다.


    이동 처리도 정확하다.

        if (i < moveCnt - 1) {
            ptr--;
        }

    현재 위치를 포함해서 moveCnt개의 타일을 뒤집기 때문에
    실제 이동 횟수는 moveCnt - 1번이어야 한다.

    예를 들어

        4 R

    이면

        0, 1, 2, 3

    총 4개의 타일을 뒤집고 최종 위치는 3이 된다.


    Boolean을

        false = 흰색
        true  = 검은색

    으로 사용하는 것도 가능하다.

    현재 ArrayList에는 실제로 한 번 이상 뒤집힌 구간만 생성되므로
    초기 회색 상태를 별도로 저장할 필요가 없다.


    시간복잡도에서 한 가지 주의할 점은

        tile.add(0, false);

    이다.

    ArrayList 맨 앞에 원소를 추가하면 기존 원소를 모두 한 칸씩 이동시키므로
    한 번 수행할 때 O(n)이 걸린다.

    따라서 왼쪽으로 새로운 영역을 많이 확장하면 전체 성능은 배열 방식보다 떨어진다.

    하지만 이 문제의 제한에서는 현재 방식으로도 충분히 풀이할 수 있다.


    현재 코드에서 별도로 수정해야 할 논리 오류는 없다.
*/