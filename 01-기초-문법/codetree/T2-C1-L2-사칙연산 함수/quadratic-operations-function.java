import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();

        String result;

        if (op == '+') {
            result = String.valueOf(plus(a, b));
        } else if (op == '-') {
            result = String.valueOf(minus(a, b));
        } else if (op == '*') {
            result = String.valueOf(multiply(a, b));
        } else if (op == '/') {
            result = String.valueOf(divide(a, b));
        } else {
            result = "False";
        }
        if (result.equals("False")) System.out.print(result);
        else System.out.printf("%d %c %d = %s", a, op, b, result);
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

/*
    사용자의 접근 방법:
    연산자에 따라 각각의 메서드(plus, minus, multiply, divide)를 호출하고,
    반환된 int 값을 String으로 변환하여 출력하는 방식으로 구현하였다.

    코드 리뷰(GPT):
    전체적인 구조는 정상적으로 동작한다.
    char 입력도 sc.next().charAt(0)으로 올바르게 처리했다.

    다만 결과값을 굳이 String으로 변환할 필요는 없다.
    모든 정상 연산의 반환 타입이 int이므로 result를 int로 두는 편이 더 자연스럽다.
    현재는 잘못된 연산자일 때 "False"를 출력해야 해서 String을 사용한 것으로 보인다.

    또 divide()는 int / int 연산이므로 정수 나눗셈이다.
    예를 들어 5 / 2의 결과는 2이다.

    주의할 점은 b가 0인 상태에서 나눗셈을 수행하면
    ArithmeticException이 발생한다.

    시간복잡도: O(1)
    공간복잡도: O(1)
*/