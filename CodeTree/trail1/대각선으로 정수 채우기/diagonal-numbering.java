import java.util.Scanner;

public class Main {

    static int cnt = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                fill(i, j, arr);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    
    static void fill(int row, int col, int[][] arr) {
        if(arr[row][col] == 0) arr[row][col] = cnt++;
        if(row+1 < arr.length && col-1 >= 0) {
            fill(row +1, col -1, arr);
        }
        return;
    }
}

/*
    idx 1 이상일 때 숫자를 채운 후 다음 row로 이동 + col.idx -1(가 -가 아니라면) 위치에 숫차 채우기

    [0][0]이고 cnt == 1일 때,
        현재 idx.value가 0이라면 cnt++ 값을 채움
        row+1, col-1한 idx가 >= 0 검사, False

    [0][1]이고 cnt == 2일 때,
        현재 idx.value가 0이라면 cnt++ 값을 채움
        row+1, col-1한 idx가 >= 0 검사, True
            row+1, col-1의 idx가 0이라면 cnt++ 값을 채움
            row+1, col-1한 idx가 >= 0 검사, False
    
    
    
    
    재귀로? 갈 수 있는 끝까지 내려가서 값 다 채우고 원래 다음의 idx에 값 넣는 방식으로.
*/