import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        System.out.print( tmp >= 100 ? "vapor" : tmp < 0 ? "ice" : "water");
    }
}