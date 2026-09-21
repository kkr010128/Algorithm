import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < 10 && b < 10) {
                System.out.printf("#%d %d\n", i, a*b);
                continue;
            }
            System.out.printf("#%d %d\n", i, -1);
        }
    }
}