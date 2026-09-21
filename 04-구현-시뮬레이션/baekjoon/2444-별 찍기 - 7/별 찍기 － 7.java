import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(" ".repeat(N - i));
            System.out.println("*".repeat(2 * i - 1));
        }
        for (int i = N - 1; i >= 1; i--) {
            System.out.print(" ".repeat(N - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }
}