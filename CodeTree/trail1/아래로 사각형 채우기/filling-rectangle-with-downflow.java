import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int n = sc.nextInt();
        int [][] a = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a[j][i] = cnt++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }
}