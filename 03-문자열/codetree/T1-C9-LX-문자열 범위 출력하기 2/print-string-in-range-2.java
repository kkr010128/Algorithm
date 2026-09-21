import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < Math.min(n, line.length()); i++) {
            System.out.print(line.charAt(line.length() - 1 - i));
        }

    }
}