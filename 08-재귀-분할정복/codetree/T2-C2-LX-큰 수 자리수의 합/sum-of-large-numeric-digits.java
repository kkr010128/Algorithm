import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumNums(sc.nextInt() * sc.nextInt() * sc.nextInt()));
    }

    private static int sumNums(int n) {
        if(n / 10 == 0) return n;
        return n % 10 + sumNums(n/10);
    }
}