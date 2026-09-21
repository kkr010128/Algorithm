import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (Character.isDigit(c)) sum += Character.getNumericValue(c);
        }
        System.out.print(sum);
    }
}

/*
    입력받은 문자열을 한 번 순회하면서 숫자인 문자만 찾아
    각 숫자의 값을 누적하여 합을 출력하는 방식으로 구현하였다.

    Character.isDigit()를 사용해 숫자 여부를 판별하고,
    Character.getNumericValue()를 이용해 문자 형태의 숫자를 정수로 변환하였다.

    코드 리뷰(GPT):

    현재 접근이 적절하다.
    문자열을 한 번만 순회하므로 시간복잡도는 O(N)이며,
    추가적인 자료구조를 사용하지 않아 공간복잡도는 O(1)이다.

    다만 문제에서 입력이 ASCII 숫자('0'~'9')만 주어진다면

        sum += c - '0';

    과 같이 계산하는 것이 더 일반적이고 약간 더 효율적이다.

    Character.getNumericValue()는 ASCII 숫자뿐 아니라
    유니코드 숫자 문자까지 처리할 수 있는 범용 메서드이므로
    단순 숫자 문자열 문제에서는 기능이 다소 과하다.

    따라서 코딩 테스트에서는

        if ('0' <= c && c <= '9') {
            sum += c - '0';
        }

    처럼 구현하는 경우가 가장 많다.
*/