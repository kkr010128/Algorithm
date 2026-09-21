import java.util.Scanner;

public class Main {
    
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int [][] arr = new int [N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col <= row; col++) {

                if (row == 0 || col == 0 || col == row) {
                    arr[row][col] = 1;
                }
                else {
                    arr[row][col] = arr[row-1][col-1] + arr[row-1][col];
                }

            }
        }
        printPascal(arr, N);
    }
    static void printPascal(int[][] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
    파스칼의 삼각형
    row 의 개수는 N으로 주어짐
    row +1 마다 데이터의 개수도 +1
    아래 행의 값을 넣을 때 별도의 계산 과정이 필요하지 않도록
    아래 행을 위한 계산 결과를 미리 저장
    -> 하려면 행이 많아질 수록 별도의 저장공간 필요

    그냥 행이 2행 이상일 때, 열이 왼쪽과 오른쪽 끝이 아닐 때
    idx로 계산


    for (int row = 0;)
*/