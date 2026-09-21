import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        int decimal = Integer.parseInt(N, A);

        if (decimal == 0) {
            System.out.print(0);
            return;
        }

        convert(decimal, B);
    }

    private static void convert(int n, int base) {
        if (n == 0) return;

        convert(n / base, base);
        System.out.print(n % base);
    }
}
/*
    A진수로 표현된 N을 먼저 10진수로 변환한 뒤,
    해당 값을 B진수로 변환하는 방식으로 접근했다.

    Integer.parseInt(N, A)를 사용하면
    A진수 문자열 N을 10진수 정수값으로 변환할 수 있다.

    이후 B진수 변환은 재귀함수를 이용했다.

    n / B를 재귀 호출하여 높은 자릿수부터 처리하고,
    재귀에서 돌아오면서 n % B를 출력하면 B진수가 순서대로 출력된다.

    코드 리뷰(GPT):
    현재 풀이가 적절하다.

    예를 들어 입력이

        A = 8
        B = 2
        N = "11"

    이라면

        Integer.parseInt("11", 8)
        → 9

    이후 convert(9, 2)가 실행된다.
        convert(9 / 2)
        convert(4 / 2)
        convert(2 / 2)
        convert(1 / 2)
        convert(0) → return

    재귀에서 돌아오면서 나머지를 출력하면

        1
        0
        0
        1

    따라서 1001이 출력된다.

    decimal == 0을 별도로 처리한 것도 필요하다.
    convert(0, B)는 바로 return하기 때문에
    이 처리가 없다면 N이 0일 때 아무것도 출력되지 않는다.

    또한 문제에서 A, B가 2~9이므로
    10 이상의 진법에서 필요한 A, B, C 등의 문자 처리를 고려할 필요가 없다.

    시간복잡도:
    A진수 입력의 길이를 L, 변환 결과의 자릿수를 K라고 하면 O(L + K)

    공간복잡도:
    재귀 호출 스택이 B진수의 자릿수만큼 필요하므로 O(K)
*/