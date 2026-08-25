import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(-1 * ((60 * sc.nextInt() + sc.nextInt()) - (60 * sc.nextInt() + sc.nextInt())));
    }
}