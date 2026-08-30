import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] moves = new int[n];
        char[] dirs = new char[n];

        int cur = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            moves[i] = sc.nextInt();
            dirs[i] = sc.next().charAt(0);

            if (dirs[i] == 'R') {
                cur += moves[i];
            } else {
                cur -= moves[i];
            }

            min = Math.min(min, cur);
            max = Math.max(max, cur);
        }

        int offset = -min;
        int[] visited = new int[max - min];

        cur = 0;

        // 실제 이동 구간 기록
        for (int i = 0; i < n; i++) {
            int next;

            if (dirs[i] == 'R') {
                next = cur + moves[i];

                for (int j = cur; j < next; j++) {
                    visited[j + offset]++;
                }
            } else {
                next = cur - moves[i];

                for (int j = cur - 1; j >= next; j--) {
                    visited[j + offset]++;
                }
            }

            cur = next;
        }

        int answer = 0;

        for (int count : visited) {
            if (count >= 2) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
/*
    먼저 모든 이동 명령을 읽으면서 현재 위치 cur을 갱신하고,
    이동 과정에서 도달하는 최소 좌표 min과 최대 좌표 max를 구했다.

    이후 음수 좌표를 배열 인덱스로 사용할 수 있도록

        offset = -min

    을 적용하고, [k, k + 1] 형태의 단위 구간마다
    몇 번 지나갔는지를 visited 배열에 기록했다.

    오른쪽 이동은

        for (int j = cur; j < next; j++)

    로 [cur, next) 구간을 기록하고,

    왼쪽 이동은

        for (int j = cur - 1; j >= next; j--)

    로 [next, cur) 구간을 기록한다.

    이렇게 하면 좌표 자체가 아니라
    정수 좌표 사이의 길이 1짜리 구간을 정확히 센다.

    예를 들어 2 R이라면

        0 -> 2

    이동하면서

        [0, 1]
        [1, 2]

    두 구간을 각각 한 번씩 지나간 것으로 기록한다.

    코드 리뷰(GPT):
    현재 풀이가 정확하다.

    특히 문제에서 요구하는 것은 "지나간 좌표의 개수"가 아니라
    "2번 이상 지나간 길이 1의 단위 구간 개수"이므로,
    visited를 좌표가 아닌 구간 기준으로 사용한 점이 핵심이다.

    visited 크기를

        max - min

    으로 잡은 것도 맞다.

    예를 들어 좌표 범위가 -3부터 5까지라면
    실제 단위 구간은

        [-3, -2], [-2, -1], ..., [4, 5]

    총 8개이므로

        5 - (-3) = 8

    개의 배열 원소가 필요하다.

    다만 이 문제의 제한은
    N <= 100, 각 이동 거리 <= 10이므로
    최대 이동 범위가 -1000 ~ 1000 정도밖에 되지 않는다.

    따라서 문제 풀이 자체만 놓고 보면
    굳이 첫 번째 순회에서 min/max를 구하지 않고,
    충분히 큰 고정 배열과 offset을 사용해 한 번에 처리하는 방법도 가능하다.

    현재 방식은 필요한 배열 크기만 정확히 계산한다는 점에서 더 일반적이다.

    시간복잡도:
    모든 실제 이동 거리를 D라고 하면 O(N + D)

    이 문제에서는 D <= 1000이므로 충분히 빠르다.

    공간복잡도:
    이동 범위의 길이를 M이라고 하면 O(N + M)
    moves와 dirs를 제거하고 다른 방식으로 구성하면 O(M)까지 줄일 수 있다.
*/