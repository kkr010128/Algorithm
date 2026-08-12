import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLine(sc.nextInt());
    }

    private static void printLine(int n) {
        if (n > 0) {
            printLine(n-1);
            System.out.println("HelloWorld");
        }
    }
}