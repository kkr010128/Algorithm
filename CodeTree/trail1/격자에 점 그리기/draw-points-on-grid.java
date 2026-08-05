import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int [][] arr = new int[n+1][n+1];
        int r, c;
        int cnt = 1;
    
        for (int i = 0; i < m; i++) {
            r = sc.nextInt();
            c = sc.nextInt();
            arr[r][c] = cnt++;
        }

        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}