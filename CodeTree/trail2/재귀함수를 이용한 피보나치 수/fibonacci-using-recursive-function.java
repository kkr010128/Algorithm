import java.util.Scanner;

public class Main {
    private static int cnt = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fib(sc.nextInt());
        System.out.print(cnt);
    }
    private static int fib(int n ) {
        if(n == 1 || n == 2) return 1;
        cnt++;
        return fib(n-1) + fib(n-2);
    }
}




