import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}