import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String st = sc.next();
        System.out.print(line.indexOf(st) != -1 ? line.indexOf(st) : "No");
    }
}