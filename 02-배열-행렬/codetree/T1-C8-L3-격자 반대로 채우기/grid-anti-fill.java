import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        int lineCnt = 0;
        int cnt = 1;

        for (int col = n-1; col >= 0; col--) {
            if(lineCnt % 2 == 0) {
                for (int row = n-1; row >= 0; row--) {
                     a[col][row] = cnt++;
                }
                lineCnt++;

            } else {
                for (int row = 0; row < n; row++) {
                    a[col][row] = cnt++;
                }
                lineCnt++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j][i]);
            }
            System.out.println();
        }
    }
}