import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] standard = { 1, 1, 2, 2, 2, 8 };
        for (int i = 0; i < 6; i++) {
            int actual = sc.nextInt();
            System.out.print((standard[i] - actual) + " ");
        }
    }
}