import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.printf("%d %d", (int)a+b, (int)a>b?a-b:b-a);
    }
}