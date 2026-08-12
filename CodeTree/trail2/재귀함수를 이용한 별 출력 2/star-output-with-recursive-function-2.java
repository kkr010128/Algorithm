import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        printStars(N);
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) System.out.print("* ");
        System.out.println();
        if (n == 1) {
            System.out.println("*");
            return;
        }

        printStars(n - 1);
        for (int i = 0; i < n; i++) System.out.print("* ");
        System.out.println();
    }
}
