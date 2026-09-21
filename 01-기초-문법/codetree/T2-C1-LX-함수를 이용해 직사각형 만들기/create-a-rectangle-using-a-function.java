import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSquare(sc.nextInt(), sc.nextInt());
    }

    public static void printSquare(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}