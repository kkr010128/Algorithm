import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int MAX_TIME = 2_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[] aPath = new int[MAX_TIME + 1];
        int[] bPath = new int[MAX_TIME + 1];

        int aTime = recordPath(reader, aPath, n);
        int bTime = recordPath(reader, bPath, m);

        int totalTime = Math.max(aTime, bTime);

        // A가 먼저 이동 끝났으면 그 위치에서 대기
        for (int time = aTime + 1; time <= totalTime; time++) {
            aPath[time] = aPath[aTime];
        }

        // B가 먼저 이동 끝났으면 마지막 위치에 대기
        for (int time = bTime + 1; time <= totalTime; time++) {
            bPath[time] = bPath[bTime];
        }

        int answer = 0;

        for (int time = 1; time <= totalTime; time++) {
            boolean previousDifferent = aPath[time - 1] != bPath[time - 1];
            boolean currentSame = aPath[time] == bPath[time];

            if (previousDifferent && currentSame) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static int recordPath(
            BufferedReader reader,
            int[] path,
            int moveCount
    ) throws IOException {

        int position = 0;
        int currentTime = 0;

        for (int i = 0; i < moveCount; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int time = Integer.parseInt(tokenizer.nextToken());
            char direction = tokenizer.nextToken().charAt(0);

            int move = direction == 'R' ? 1 : -1;

            for (int second = 0; second < time; second++) {
                position += move;
                path[++currentTime] = position;
            }
        }

        return currentTime;
    }
}

/* 
    Lesson 2. 배열 기록

    # 좌우로 움직이는 로봇

    1차원 직선 위에서 로봇 A와 B가 같은 위치에서 출발한다.
    두 로봇은 1초에 한 칸씩 주어진 방향으로 이동한다.

    매초 두 로봇의 위치를 비교하여,
    바로 직전에는 서로 다른 위치에 있었지만 현재 같은 위치가 된 경우의 횟수를 구한다.

    한 로봇이 먼저 모든 이동을 마치면 마지막 위치에 계속 머무른다.
    따라서 다른 로봇이 계속 움직이는 동안 정지한 로봇과 만나는 경우도 포함한다.
    두 로봇이 모두 이동을 마친 이후의 상황은 고려하지 않는다.

    # 입력

    첫 번째 줄에 로봇 A의 이동 횟수 N과 로봇 B의 이동 횟수 M이 주어진다.
    이후 N개의 줄에 로봇 A의 이동 시간 t와 이동 방향 d가 주어진다.
    이후 M개의 줄에 로봇 B의 이동 시간 t와 이동 방향 d가 주어진다.

    # 제한 조건

    - 1 <= N, M <= 50,000
    - 1 <= t <= 2,000,000
    - d는 L 또는 R이다.
    - 각 로봇의 총 이동 거리는 2,000,000을 넘지 않는다.
    - 이동을 마친 로봇은 마지막 위치에 계속 머무른다.
    - 처음 두 로봇이 같은 위치에서 출발하는 것은 만난 횟수에 포함하지 않는다.

    # 출력

    직전에는 서로 다른 위치에 있다가 현재 같은 위치가 된 횟수를 출력한다.

    # 예제 입력 1

    4 5
    3 L
    5 R
    1 L
    2 R
    4 R
    1 L
    3 L
    4 R
    2 L
*/
/*
    A와 B의 위치를 각각 int 배열에 초 단위로 기록하는 방식으로 해결하였다.

    recordPath()에서 각 로봇의 출발 위치를 0으로 두고,
    R은 +1, L은 -1로 변환하여 매초 현재 위치를 갱신한다.
    갱신한 위치를 path[++currentTime]에 저장하므로
    path[t]는 정확히 t초가 지난 시점의 로봇 위치를 의미한다.

    두 로봇의 총 이동 시간이 다를 수 있으므로
    totalTime을 Math.max(aTime, bTime)으로 설정한다.
    먼저 이동을 끝낸 로봇은 자신의 마지막 위치를
    totalTime까지 반복해서 기록하여 정지 상태를 표현한다.

    이후 1초부터 totalTime까지 순회하면서
    직전 위치는 달랐고 현재 위치는 같은 경우에만 answer를 증가시킨다.

        boolean previousDifferent = aPath[time - 1] != bPath[time - 1];
        boolean currentSame = aPath[time] == bPath[time];

        if (previousDifferent && currentSame) {
            answer++;
        }

    이 방식에서는 time = 1일 때 path[0]을 직전 위치로 확인한다.
    두 배열의 path[0]은 int 배열의 기본값인 0이므로 두 로봇의 출발 위치를 나타낸다.
    따라서 처음부터 같은 위치에서 출발한 것은 previousDifferent가 false가 되어
    만난 횟수에 포함되지 않는다.

    코드 리뷰(GPT):
    현재 풀이는 문제의 조건을 모두 처리하는 올바른 시뮬레이션 풀이이다.

    이전 풀이에서 한 로봇의 이동 경로만 저장하면,
    경로를 저장하지 않은 로봇이 먼저 멈췄을 때
    이후 다른 로봇과 다시 만나는 상황을 놓칠 수 있었다.

    현재 풀이는 A와 B의 경로를 모두 기록하고,
    먼저 끝난 로봇의 마지막 위치를 totalTime까지 채우므로
    A가 먼저 끝나는 경우와 B가 먼저 끝나는 경우를 모두 동일하게 처리한다.

    또한 단순히 현재 두 위치가 같은지만 확인하지 않고
    직전에는 달랐는지도 함께 검사하기 때문에,
    두 로봇이 여러 초 동안 연속해서 같은 위치에 있더라도
    처음 같아지는 순간만 한 번 계산한다.

    MAX_TIME + 1 크기로 배열을 만든 이유도 적절하다.
    인덱스 0을 출발 시점으로 사용하고 최대 2,000,000초의 위치까지
    저장해야 하므로 총 2,000,001개의 공간이 필요하다.

    int 배열 두 개를 사용하므로 ArrayList<Integer>와 달리
    Integer 객체와 오토박싱으로 인한 추가 메모리 사용도 발생하지 않는다.

    각 로봇의 총 이동 시간을 TA, TB라고 하면
    경로 기록에 O(TA + TB),
    정지 상태를 채우고 전체 경로를 비교하는 데 O(max(TA, TB))가 필요하다.
    따라서 전체 시간복잡도는 O(TA + TB)이다.

    두 로봇의 위치를 초 단위로 저장하므로
    공간복잡도는 O(MAX_TIME)이다.
*/