import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = swap(n, m);
        System.out.printf("%d %d", arr[0], arr[1]);
    }

    public static int[] swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        return new int[]{a, b};
    }
}