import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        while(!tmp.equals("END")) {
            StringBuilder sb = new StringBuilder(tmp);
            System.out.println(sb.reverse());
            tmp = sc.next();
        }
    }
}
/*
    문자열을 입력받아 역순으로 출력하고,
    입력값이 "END"이면 반복을 종료하는 방식으로 구현하였다.

    StringBuilder의 reverse()를 이용하여 문자열을 간단하게 뒤집었다.

    코드 리뷰(GPT):

    현재 접근이 적절하다.
    각 문자열에 대해 reverse()를 한 번 수행하므로
    문자열 길이를 L이라 할 때 시간복잡도는 O(L)이다.

    처음에는 문자열 종료 조건을

        tmp != "END"

    로 비교하였다.

    하지만 String은 참조 타입이므로 ==, !=는 문자열의 내용이 아니라
    객체의 주소를 비교한다.

    따라서 종료 조건은

        !tmp.equals("END")

    처럼 equals()를 사용해야 올바르게 동작한다.

    또한 처음에는 반복문 마지막에서

        tmp = sc.next();

    를 호출할 때 입력이 더 이상 없는 경우를 고려하지 못해
    NoSuchElementException이 발생할 수 있다고 생각하였다.

    하지만 이 문제는 마지막 입력이 항상 "END"로 주어진다고 보장하므로,
    "END"를 읽으면 다음 입력을 요청하지 않고 반복문이 종료되어
    현재 구현은 예외 없이 정상적으로 동작한다.

    StringBuilder의 reverse()를 활용하여
    별도의 반복문 없이 문자열을 뒤집은 점도 좋은 구현이다.
*/