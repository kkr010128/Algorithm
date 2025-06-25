import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        do {
            A = sc.nextInt();
            B = sc.nextInt();
            if (A != 0 && B != 0)
                System.out.println(A + B);
        } while (A != 0 && B != 0);
    }
}