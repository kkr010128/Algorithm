import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int aMove = Integer.parseInt(tokenizer.nextToken());
        int bMove = Integer.parseInt(tokenizer.nextToken());

        ArrayList<Integer> aPath = new ArrayList<>();
        ArrayList<Integer> bPath = new ArrayList<>();

        int distance = 0;

        for (int i = 0; i < aMove; i++) {
            tokenizer = new StringTokenizer(reader.readLine());

            int speed = Integer.parseInt(tokenizer.nextToken());
            int time = Integer.parseInt(tokenizer.nextToken());

            for (int t = 0; t < time; t++) {
                distance += speed;
                aPath.add(distance);
            }
        }

        distance = 0;

        for (int i = 0; i < bMove; i++) {
            tokenizer = new StringTokenizer(reader.readLine());

            int speed = Integer.parseInt(tokenizer.nextToken());
            int time = Integer.parseInt(tokenizer.nextToken());

            for (int t = 0; t < time; t++) {
                distance += speed;
                bPath.add(distance);
            }
        }

        int countPass = 0;
        char prevHead = 'n';

        for (int i = 0; i < aPath.size(); i++) {
            int a = aPath.get(i);
            int b = bPath.get(i);

            char currHead;

            if (a > b) {
                currHead = 'a';
            } else if (a < b) {
                currHead = 'b';
            } else {
                currHead = 'n';
            }

            if (prevHead != 'n' && currHead != 'n' && prevHead != currHead) {
                countPass++;
            }

            if (currHead != 'n') {
                prevHead = currHead;
            }
        }

        System.out.println(countPass);
    }
}

/* 
    Lesson 2. 배열 기록

    # 선두를 지켜라

    A와 B는 같은 위치에서 출발하여 같은 방향으로 이동한다.
    A는 N번, B는 M번에 걸쳐 주어진 속도로 주어진 시간 동안 이동한다.
    매 시간마다 두 사람의 누적 이동 거리를 비교하여 선두가 바뀐 횟수를 구한다.

    두 사람의 위치가 같아 공동 선두가 된 경우에는 선두가 바뀐 것으로 처리하지 않는다.
    이후 한 사람이 다시 앞서게 되었을 때, 이전 단독 선두와 다른 사람이라면 선두가 바뀐 것으로 처리한다.

    # 입력

    첫 번째 줄에 A와 B의 이동 정보 개수 N, M이 주어진다.
    이후 N개의 줄에 A의 속도 v와 이동 시간 t가 주어진다.
    그 다음 M개의 줄에 B의 속도 v와 이동 시간 t가 주어진다.

    # 제한 조건

    - 1 <= N, M <= 1,000
    - 0 <= v, t <= 1,000
    - A와 B의 총 이동 시간은 동일하다.

    # 출력

    선두가 바뀐 횟수를 출력한다.

    # 예제 입력 1

    4 3
    1 2
    4 1
    1 1
    2 10
    2 3
    1 2
    3 9
*/

/*
    A와 B가 매 시간 이동한 뒤의 누적 거리를 각각 aPath와 bPath에 기록하는 방식으로 해결했다.
    각 이동 구간의 속도와 시간을 입력받고, 해당 시간이 지속되는 동안 매 시간 distance에 speed를 더해
    시간별 위치를 ArrayList에 저장했다.

    두 경로를 같은 시간 인덱스로 순회하면서 A가 앞서면 'a', B가 앞서면 'b',
    위치가 같으면 'n'으로 현재 선두를 구분했다.
    prevHead에는 마지막으로 단독 선두였던 사람을 저장하고,
    공동 선두인 'n'은 prevHead를 변경하지 않는다.
    따라서 공동 선두를 거친 뒤 다시 한 사람이 앞서더라도 마지막 단독 선두와 비교할 수 있다.
    이전 단독 선두와 현재 단독 선두가 다를 때만 countPass를 증가시켜 선두 교체 횟수를 계산한다.

    코드 리뷰(GPT):
    현재 풀이는 문제의 공동 선두 조건을 올바르게 처리하며 정답을 구한다.
    특히 currHead가 'n'일 때 prevHead를 갱신하지 않는 부분이 핵심이다.
    예를 들어 A 선두 -> 공동 선두 -> B 선두가 되면 prevHead에는 계속 'a'가 남아 있으므로
    B가 앞서는 순간 선두 교체를 정확하게 1회 계산한다.

    A와 B의 총 이동 시간이 동일하다는 조건이 있으므로
    aPath.size()를 기준으로 bPath에 접근하는 것도 안전하다.

    다만 ArrayList<Integer>에 모든 시간별 위치를 저장하므로 전체 이동 시간이 T라면
    두 리스트에 O(T)의 추가 공간이 필요하다.
    배열 기록을 연습하는 문제의 취지에는 적절한 구현이며,
    현재 코드에서 정확성이나 중복 측면의 특별한 문제는 없다.

    시간복잡도는 O(T)이고,
    공간복잡도는 O(T)이다.
*/