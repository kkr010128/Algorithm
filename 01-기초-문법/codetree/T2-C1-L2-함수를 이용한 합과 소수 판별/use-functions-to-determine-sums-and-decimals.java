import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(getResult(sc.nextInt(), sc.nextInt()));
    }

    public static int getResult(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if(isPrime(i) && (isEven(i))) cnt++;
        }
        return cnt;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int n) {
        if (n != 100 && (((n % 10) + (n / 10)) % 2 == 0)) return true;
        return false;
    }

}

/*
    a부터 b까지 순회하면서,
    소수이면서 각 자리수의 합이 짝수인 수를 세는 방식으로 구현하였다.

    코드 리뷰(GPT):
    문제 조건이 100 이하라면 현재 방식으로 정답을 구할 수 있다.

    isPrime()은 2부터 sqrt(n)까지만 확인하므로 적절하다.

    isEven()의
    (n % 10) + (n / 10)
    은 1~99 범위에서는 각 자리수의 합을 정확히 계산한다.

    다만 100은 소수가 아니므로 getResult()의
    isPrime(i) && isEven(i)
    에서 isPrime(100)이 false가 되는 순간 단락 평가가 발생해
    isEven(100)은 호출되지 않는다.

    따라서 n != 100 조건은 없어도 된다.

    public static boolean isEven(int n) {
        return ((n % 10) + (n / 10)) % 2 == 0;
    }

    또한 아래 괄호는 불필요하다.

    if (isPrime(i) && isEven(i)) cnt++;

    시간복잡도:
    O((b - a + 1) * sqrt(b))

    공간복잡도:
    O(1)
*/