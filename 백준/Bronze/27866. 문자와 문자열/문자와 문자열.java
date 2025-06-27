import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(input.charAt(num - 1));
    }
}