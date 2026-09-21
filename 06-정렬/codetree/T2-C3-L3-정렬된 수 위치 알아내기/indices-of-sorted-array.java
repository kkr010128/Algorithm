import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Num[] nums = new Num[n];
        int[] position = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums[i] = new Num(i + 1, num);
        }

        Arrays.sort(nums, (a, b) -> {
            if (a.num == b.num) {
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.num, b.num);
        });

        for (int i = 0; i < n; i++) {
            position[nums[i].idx] = i + 1;
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", position[i]);
        }
    }
}

class Num {
    int idx;
    int num;

    public Num(int idx, int num) {
        this.idx = idx;
        this.num = num;
    }
}/*
    접근 방법:
    각 숫자를 Num 객체로 저장하면서 입력 당시의 위치를 idx에 함께 저장하였다.

    이후 숫자(num)를 기준으로 오름차순 정렬하고,
    숫자가 같다면 기존 번호(idx)가 작은 순서로 정렬하였다.

    정렬 후 원래 번호의 숫자가 몇 번째 위치로 이동했는지를
    position 배열에 저장하였다.

        position[nums[i].idx] = i + 1;

    예를 들어 정렬된 nums의 원래 번호가

        [3, 1, 4, 2]

    라면

        position[3] = 1;
        position[1] = 2;
        position[4] = 3;
        position[2] = 4;

    가 된다.

    따라서 position을 1번부터 순서대로 출력하면
    각 숫자의 정렬 후 위치를 바로 구할 수 있다.

    코드 리뷰(GPT):
    처음에는 정렬 후 각 숫자의 위치를 다시 탐색하는 방법을 생각할 수 있지만,
    그렇게 하면 각 원소마다 배열을 순회해야 하므로 O(N^2)이 된다.

    현재 방식은 객체에 원래 위치(idx)를 저장하고,
    정렬 직후 position 배열에 결과를 기록하므로 별도의 탐색이 필요하지 않는다.

    정렬 기준 역시 올바르게 작성되었다.

        if (a.num == b.num)
            return Integer.compare(a.idx, b.idx);

        return Integer.compare(a.num, b.num);

    → 숫자 오름차순
    → 숫자가 같으면 기존 번호 오름차순

    정렬에 O(N log N), 정렬 결과 기록에 O(N)이 필요하므로
    전체 시간복잡도는 O(N log N)이다.

    position과 nums 배열을 사용하므로 공간복잡도는 O(N)이다.
*/