import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> aPath = new ArrayList<>();
    static ArrayList<Integer> bPath = new ArrayList<>();

    static int positionA = 0;
    static int positionB = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char direction = sc.next().charAt(0);
            int second = sc.nextInt();

            move(direction, second, true);
        }

        for (int i = 0; i < M; i++) {
            char direction = sc.next().charAt(0);
            int second = sc.nextInt();

            move(direction, second, false);
        }

        int answer = -1;

        for (int i = 0; i < aPath.size(); i++) {
            if (aPath.get(i).equals(bPath.get(i))) {
                answer = i + 1;
                break;
            }
        }

        System.out.print(answer);
    }

    private static void move(char direction, int second, boolean isA) {
        int moveDistance = direction == 'R' ? 1 : -1;

        for (int i = 0; i < second; i++) {
            if (isA) {
                positionA += moveDistance;
                aPath.add(positionA);
            } else {
                positionB += moveDistance;
                bPath.add(positionB);
            }
        }
    }
}
/*
    A와 B의 입력이 각각 따로 주어지므로 각 사람의 이동 위치를 초 단위로 저장한 뒤 비교하였다.

    출발 위치를 0으로 두고 R은 +1, L은 -1로 변환한다.
    이동 속도가 1m/s이므로 각 명령의 이동 시간만큼 반복하면서 현재 위치를 갱신하고
    aPath와 bPath에 저장한다.

    따라서 aPath.get(i)와 bPath.get(i)는 각각 i + 1초 후의 위치를 의미한다.
    두 경로를 처음부터 비교하여 위치가 처음 같아지는 순간의 i + 1을 출력한다.
    끝까지 같은 위치가 없다면 -1을 출력한다.

    코드 리뷰(GPT):
    현재 풀이는 문제 조건에 맞는 올바른 시뮬레이션 풀이이다.

    이동 방향을 char로 받고 move() 내부에서
        int moveDistance = direction == 'R' ? 1 : -1;
    로 실제 이동량으로 변환한 방식이 의미가 명확하다.

    또한 시작 위치인 0은 경로에 저장하지 않고 이동 이후의 위치만 기록하므로,
    문제에서 요구하는 "움직임을 시작한 이후"의 최초 만남만 검사하게 된다.

    A와 B의 총 이동 시간이 같다고 보장되므로
    aPath.size()를 기준으로 두 경로를 비교해도 안전하다.

    다만 ArrayList<Integer>는 int 값을 Integer 객체로 오토박싱하므로
    최대 이동 시간이 커질 경우 int[]보다 메모리 사용량이 증가할 수 있다.
    이 문제에서는 최대 총 이동 시간이 1,000,000초이므로
    메모리 제한을 더 안정적으로 고려한다면 int[]를 사용하는 방식도 가능하다.

    현재 구조에서는 A와 B의 이동 로직을 하나의 move()로 묶어
    중복을 줄였으므로 구현 자체는 충분히 간결하다.

    총 이동 시간을 T라고 하면
    A와 B의 이동 경로 기록에 O(T),
    두 경로 비교에 O(T)가 필요하므로
    시간복잡도는 O(T)이다.

    두 사람의 위치를 각각 T개씩 저장하므로
    공간복잡도는 O(T)이다.
*/