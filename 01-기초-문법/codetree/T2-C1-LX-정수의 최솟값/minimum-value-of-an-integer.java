import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(getMinimum(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    public static int getMinimum(int a, int b, int c) {
        int min = (a > b) ? (b > c ? c : b) : (a > c ? c : a);
        return min; 
    }
}

/*
    세 수 중 최솟값을 중첩 삼항 연산자로 구하는 방식이다.

    코드 리뷰(GPT):
    현재 코드는 정상적으로 동작한다.

    int min = (a > b)
            ? (b > c ? c : b)
            : (a > c ? c : a);

    a > b이면 b와 c 중 작은 값을 선택하고,
    a <= b이면 a와 c 중 작은 값을 선택하므로
    세 수 전체에서 최솟값을 정확히 구한다.

    시간복잡도는 O(1), 공간복잡도는 O(1)이다.

    다만 중첩 삼항 연산자는 조건이 많아질수록 읽기 어려워질 수 있다.
    현재처럼 비교가 3개 정도인 경우에는 사용해도 무방하다.
*/