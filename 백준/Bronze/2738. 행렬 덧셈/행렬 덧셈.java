import java.io.IOException;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    static int col = sc.nextInt();
    static int row = sc.nextInt();
    static int[][] matrix = new int[col][row];

    public static void main(String[] args) throws IOException {
        calculate();
        print();
    }

    static void calculate() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] += sc.nextInt();
            }
        }
    }

    static void print() {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}