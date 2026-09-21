import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder nums = new StringBuilder();
        StringBuilder cmp = new StringBuilder();

        int numLength = sc.nextInt();
        int cmpLength = sc.nextInt();

        for(int i = 0; i < numLength; i++) nums.append(" " + sc.nextInt() + " ");
        for(int i = 0; i < cmpLength; i++) cmp.append(" " + sc.nextInt() + " ");

        System.out.print(checkNums(nums, cmp) ? "Yes" : "No");
    }

    public static boolean checkNums(StringBuilder nums, StringBuilder cmp) {
        return nums.toString().contains(cmp.toString());
    }
}
/*
    접근 방법:
    두 정수 수열을 StringBuilder에 저장하되,
    각 원소의 앞뒤에 공백을 추가해 숫자의 경계를 명확하게 만든 뒤
    contains()를 이용해 두 번째 수열이 첫 번째 수열에 연속해서 포함되는지 확인하였다.

    코드 리뷰(GPT):
    현재 방식은 문자열 변환 시 숫자 경계가 사라지는 문제를 방지한다.

    예:
    nums = [92, 40]
    cmp  = [2]

    단순히 뒤에 공백만 붙이면
    "92 " 안에 "2 "가 포함되어 잘못 매칭될 수 있다.

    현재 코드는 각 숫자를 다음처럼 저장한다.

    " 92 "
    " 2 "

    따라서 " 92 " 안에는 " 2 "가 없으므로
    서로 다른 숫자가 잘못 포함되는 문제를 막을 수 있다.

    다만 현재 구현은 원소마다 앞뒤에 공백을 붙이므로
    실제 문자열에는 공백이 연속해서 두 번 들어간다.

    예:
    1, 2, 3
    -> " 1  2  3 "

    nums와 cmp를 동일한 방식으로 만들기 때문에
    정답 판별에는 문제가 없다.

    문자열 연결보다 append()를 연속 호출하면 조금 더 깔끔하게 작성할 수 있다.

    nums.append(" ").append(sc.nextInt()).append(" ");
    cmp.append(" ").append(sc.nextInt()).append(" ");

    시간복잡도:
    문자열 탐색 기준 최악의 경우 O(n * m)

    공간복잡도:
    O(n + m)
*/