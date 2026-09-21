import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [203];

        int n = sc.nextInt();
        while(n > 0) {
            int from = sc.nextInt() + 100, to = sc.nextInt() + 100;
            
            for (int i = from; i < to; i++) {
                arr[i] += 1;
            }
            n--;
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length - 1]);
    }
}
/*
    좌표의 범위에 음수가 포함되므로 모든 좌표에 100을 더해
    배열의 인덱스로 사용할 수 있도록 변환하였다.

    예를 들어 좌표 범위가 -100 ~ 100이라면

        -100 →   0
         -50 →  50
           0 → 100
          50 → 150
         100 → 200

    이 된다.

    절댓값을 사용하는 것과 달리 +100을 하는 방식은
    좌표 사이의 거리와 순서를 그대로 유지한다.

    각 선분 [from, to]에 대해서는

        for (int i = from; i < to; i++)

    로 처리하여 오른쪽 끝점을 제외하였다.

    따라서 [1, 5]와 [5, 7]처럼 끝점에서만 만나는 두 선분은
    겹치는 것으로 계산되지 않는다.

    코드 리뷰(GPT):
    현재 풀이는 올바르다.

    특히 이전의 음수 좌표 문제를 offset 방식으로 정확하게 해결했다.

    다만 최댓값만 구하면 되므로 Arrays.sort(arr)는 불필요하다.
    배열을 한 번 순회하면서 최댓값을 찾는 것이 더 적절하다.

        int max = 0;
        for (int count : arr) {
            max = Math.max(max, count);
        }

    현재 배열 크기가 작기 때문에 성능 차이는 크지 않지만,
    최댓값을 구하기 위해 전체 배열을 정렬할 필요는 없다.

    시간복잡도:
    구간을 직접 칠하는 비용 + 정렬 O(M log M)

    정렬 대신 최댓값을 탐색하면:
    구간을 직접 칠하는 비용 + O(M)

    여기서 M은 좌표를 표현하는 배열의 크기이다.
*/