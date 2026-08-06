import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        sb.append(sum);
        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
/*
    입력받은 수들의 합을 문자열로 변환한 뒤,
    첫 번째 문자를 문자열의 맨 뒤로 이동시키는 방식으로 구현하였다.

    StringBuilder의 append()와 deleteCharAt()을 이용하여
    문자열을 직접 수정하였다.

    코드 리뷰(GPT):

    접근 방식이 적절하다.
    합계를 한 번 계산한 뒤 문자열을 한 번만 수정하므로
    시간복잡도는 O(N)이다.

    특히

        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);

    의 순서를 올바르게 작성한 점이 좋다.

    먼저 첫 문자를 맨 뒤에 추가한 후 삭제해야
    첫 번째 문자를 잃지 않고 회전(Rotation)시킬 수 있다.

    다만 StringBuilder의 길이가 1인 경우에도
    위 코드는 정상적으로 동작하지만 결과가 동일하므로
    굳이 수행하지 않아도 된다.

    또한 이 문제에서는 StringBuilder를 사용하는 것이 적절하지만,
    문자열을 새로 만들어도 되는 상황이라면

        String s = Integer.toString(sum);
        System.out.println(s.substring(1) + s.charAt(0));

    처럼 구현하는 방법도 있다.
*/