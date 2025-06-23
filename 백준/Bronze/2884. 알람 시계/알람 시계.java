import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M - 45 < 0) {
            M = 60 + M - 45;
            if (H - 1 < 0)
                H = 23;
            else
                H -= 1;
        } else
            M -= 45;

        System.out.println(H + " " + M);
    }
}