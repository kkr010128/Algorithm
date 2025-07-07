import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int col = 1;
        int row = 1;
        int num = 0;
        int max = 0;
        int r = 0;
        int c = 0;
        for (int i = 1; i <= 81; i++) {
            num = sc.nextInt();
            if (num >= max) {
                max = num;
                r = row;
                c = col;
            }
            if (col % 9 == 0) {
                col = 1;
                row++;
            } else
                col++;
        }
        System.out.printf("%d\n%d %d", max, r, c);
    }
}