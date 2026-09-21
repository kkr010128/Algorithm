import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() / 4;
        for (int i = 0; i < N; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}