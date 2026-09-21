import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) System.out.print(0);
        binary(num);
    }

    public static void binary(int n) {
        if (n == 0) return;
        binary(n / 2);
        System.out.print(n % 2);
    }
}