import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int pair = sc.nextInt();
            if (X > pair)
                System.out.printf("%d ", pair);
        }

    }
}