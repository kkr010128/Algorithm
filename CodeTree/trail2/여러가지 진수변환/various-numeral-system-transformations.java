import java.util.Scanner;

public class Main {
    static int B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        B = sc.nextInt();

        convert(N);
    }

    private static void convert(int n) {
        if (n == 0) return;

        convert(n / B);
        System.out.print(n % B);
    }
}