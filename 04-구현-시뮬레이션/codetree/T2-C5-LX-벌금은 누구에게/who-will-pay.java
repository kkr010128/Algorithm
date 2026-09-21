import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] penalty = new int[n + 1];
        int answer = -1;

        for (int i = 0; i < m; i++) {
            int student = sc.nextInt();

            penalty[student]++;

            if (penalty[student] == k) {
                answer = student;
                break;
            }
        }

        System.out.println(answer);
    }
}