import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point [] points = new Point [n];

        
        for (int i = 0; i < n; i++) {
            points[i] = new Point(i+1, sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(points, (a, b) -> {
            if (a.distance == b.distance) return a.idx - b.idx;
            return a.distance - b.distance;
        });
        
        for (int i = 0; i < n; i++) {
            System.out.println(points[i].idx);
        }
    }
}

class Point {
    int idx;
    int distance;
    
    public Point(int idx, int x, int y) {
        this.idx = idx;
        x = (x < 0) ? x * -1 : x;
        y = (y < 0) ? y * -1 : y;
        this.distance = x + y;
    }
}

/*
    접근 방법:
    각 점의 입력 순서를 번호(idx)로 저장하고,
    원점 (0, 0)까지의 맨해튼 거리인 |x| + |y|를 미리 계산하여 distance에 저장하였다.

    이후 Arrays.sort()를 이용해 다음 기준으로 정렬하였다.

    1. 원점과의 거리(distance)가 작은 점이 앞에 온다.
    2. 거리가 같다면 점의 번호(idx)가 작은 점이 앞에 온다.

        Arrays.sort(points, (a, b) -> {
            if (a.distance == b.distance) return a.idx - b.idx;
            return a.distance - b.distance;
        });

    코드 리뷰(GPT):
    맨해튼 거리를 객체 생성 시 한 번 계산하여 저장한 점이 적절하다.
    정렬 과정에서 매번 |x| + |y|를 다시 계산하지 않아 코드도 단순하다.

    현재 절댓값 처리는

        x = (x < 0) ? x * -1 : x;
        y = (y < 0) ? y * -1 : y;

    로 구현했는데, Java에서는 Math.abs()를 사용하면 더 간결하게 표현할 수 있다.

        this.distance = Math.abs(x) + Math.abs(y);

    또한 Comparator에서 뺄셈을 사용하는 것보다
    Integer.compare()를 사용하는 것이 정수 overflow에 더 안전하다.

        Arrays.sort(points, (a, b) -> {
            if (a.distance == b.distance) {
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.distance, b.distance);
        });

    시간복잡도는 정렬에 O(N log N),
    Point 객체를 저장하기 위한 공간복잡도는 O(N)이다.
*/