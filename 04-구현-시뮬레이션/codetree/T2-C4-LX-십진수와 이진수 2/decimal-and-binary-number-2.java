import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int result = Integer.parseInt(n, 2);
        System.out.print(Integer.toBinaryString((result << 4) + result));
    }
}