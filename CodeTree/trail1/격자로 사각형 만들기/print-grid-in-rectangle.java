import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int [][] arr = new int [10][10];

        // 격자 생성 (좌, 상 <- 1)
        for(int i = 0; i < 10; i++){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        // 수 채우기 (row.idx(1) && col.idx(1)부터 [좌, 좌상, 상의 합])
        for (int r = 1; r < N; r++) {
            for (int c = 1; c < N; c++) {
                arr[r][c] = arr[r-1][c-1] + arr[r-1][c] + arr[r][c-1];
            }
        }

        // Print range of input
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}