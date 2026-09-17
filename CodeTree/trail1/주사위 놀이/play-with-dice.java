import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[7];

        for (int i = 0; i < 10; i++) {
            int dice = sc.nextInt();
            count[dice]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.printf("%d - %d%n", i, count[i]);
        }
    }
}