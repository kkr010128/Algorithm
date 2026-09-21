import java.util.*;

public class Main {
    static int n;
    static int cnt = 3;
    static ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2));
    // static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int result = (n == 1) ? 1 : (n == 2) ? 2 : getValue();
        System.out.print(result); 
    }

    private static int getValue() {
        if(cnt > n) return list.get(n - 1);
        list.add(list.get(cnt / 3 - 1) + list.get(cnt - 2));
        cnt++;
        return getValue();
    }
} 
/*
    접근 방법:
    수열의 첫 번째 항과 두 번째 항인 1, 2를 ArrayList에 미리 저장하고,
    cnt를 현재 생성할 항의 번호로 사용하였다.

    cnt = 3부터 시작하여
    A(cnt) = A(cnt / 3) + A(cnt - 1)
    점화식을 이용해 새로운 값을 리스트에 추가한다.

    ArrayList는 0-based index이므로
    A(cnt / 3) -> list.get(cnt / 3 - 1)
    A(cnt - 1) -> list.get(cnt - 2)
    로 변환하였다.

    cnt가 n보다 커졌다면 이미 n번째 항까지 생성된 상태이므로
    list.get(n - 1)을 반환한다.

    코드 리뷰(GPT):
    현재 로직은 문제의 점화식을 정확히 구현하였다.

    특히 이전 코드에서 발생했던
    "항 번호와 ArrayList 인덱스를 혼용하는 문제"가 해결되었다.

    cnt를 "현재 생성할 항 번호"로 정의한 것도 명확하다.

    다만 n == 1, n == 2를 main()에서 삼항 연산자로 처리하기보다는
    getValue() 내부의 종료 조건으로 통합하면 재귀 함수의 책임이 더 명확해질 수 있다.

    현재 방식도 정답이며,
    N <= 15이므로 시간복잡도와 공간 사용량 모두 충분하다.
*/