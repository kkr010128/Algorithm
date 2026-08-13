import java.util.Scanner;

public class Main {
    public static int sum(int n) { 
        // 한 자리 숫자라면 제곱한 값이 결과가 됩니다.
        if(n < 10)
            return n * n;
        int digit = (n % 10);
        return sum(n / 10) + digit * digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
