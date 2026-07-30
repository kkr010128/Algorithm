import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int row, col;

        int [][] arr = new int [N+1][N+1];
        for (int i = 0; i < M; i++) {
            row = sc.nextInt();
            col = sc.nextInt();
            arr[row][col] = row * col;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}