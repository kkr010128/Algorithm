import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(count(sc.nextInt(), 0));
    }

    private static int count(int n, int cnt) {
        if (n == 1) return cnt++;
        cnt++;
        if (n % 2 == 0) return count(n/2, cnt);
        else {
            return count(n * 3 + 1, cnt);
        }
    }
}