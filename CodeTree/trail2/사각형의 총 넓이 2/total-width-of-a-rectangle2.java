import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] grid = new int[202][202];
        int n = sc.nextInt();
        int OFFSET = 100;
        int sum = 0;
      
        for(int r = 0; r < n; r++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;
            int a = sc.nextInt() + OFFSET;
            int b = sc.nextInt() + OFFSET;

            for(int i = x; i < a; i++) {
                for(int j = y; j < b; j++) {
                    grid[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < 201; i++) {
            for(int j = 0; j < 201; j++) {
                sum += grid[i][j];
            }
        }
        System.out.print(sum);
    }

}