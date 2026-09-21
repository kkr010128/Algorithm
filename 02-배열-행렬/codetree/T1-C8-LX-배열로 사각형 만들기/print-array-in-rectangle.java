public class Main {
    public static void main(String[] args) {
        int[][] a = {
            {1,1,1,1,1},
            {1,0,0,0,0},
            {1,0,0,0,0},
            {1,0,0,0,0},{1,0,0,0,0}
        };

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}