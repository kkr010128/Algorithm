import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        printNumbers(N);
    }

    public static void printNumbers(int n) {
        System.out.print(n + " ");

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }
}