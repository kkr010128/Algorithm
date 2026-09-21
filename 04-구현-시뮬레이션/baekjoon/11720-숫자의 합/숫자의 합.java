import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        String sen = sc.nextLine();
        for (int i = 0; i < len; i++) {
            sum += sen.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}