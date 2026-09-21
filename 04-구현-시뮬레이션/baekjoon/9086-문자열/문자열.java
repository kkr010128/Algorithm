import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= num; i++) {
            String input = sc.nextLine();
            System.out.printf("%s%s\n", input.charAt(0), input.charAt(input.length() - 1));
        }
    }
}