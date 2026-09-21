import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%c\n%.2f\n%.2f", sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
    }
}