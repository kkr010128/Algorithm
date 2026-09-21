import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);
        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            result = result * B + Character.digit(N.charAt(i), B);
        }
        System.out.println(result);
    }
}