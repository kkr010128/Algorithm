import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 1;
        
        ArrayList <Integer> list = new ArrayList <>();

        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            Collections.sort(list);
            if(cnt++ % 2 != 0) {
                System.out.printf("%d ", list.get((list.size()-1) / 2));
            }
        }
    }
}
/*
    접근 방법:
    입력받은 값을 ArrayList에 하나씩 추가하고,
    매 입력마다 현재까지의 값을 오름차순으로 정렬하였다.

    홀수 번째 원소가 입력된 경우에만
    정렬된 리스트의 가운데 인덱스 값을 출력하여 중앙값을 구하였다.

    코드 리뷰(GPT):
    이전 코드의 논리 오류였던
    "짝수 번째 입력에서 출력하는 문제"를 수정하였다.

    cnt는 1부터 시작하고 후위 증가 연산자를 사용하므로
    cnt++ % 2 != 0 조건은 1, 3, 5, ... 번째 입력에서 true가 된다.

    중앙값 인덱스:
    (list.size() - 1) / 2
    역시 현재 리스트의 크기가 홀수일 때 정확하다.

    현재 코드는 정답이다.

    다만 cnt는 별도로 둘 필요 없이
    반복문의 i를 이용해 (i % 2 == 0)으로 판단할 수 있다.

    또한 매 입력마다 Collections.sort()를 수행하므로
    최대 N번 정렬하게 된다.
    N <= 100이므로 현재 제한에서는 충분하다.
*/