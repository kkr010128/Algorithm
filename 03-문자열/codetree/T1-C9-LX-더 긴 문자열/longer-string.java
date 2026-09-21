import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        int diff = line1.length() - line2.length();

        if(diff == 0) System.out.print("same");
        else System.out.printf("%s %d", diff > 0 ? line1 : line2, diff > 0 ? line1.length() : line2.length());
    }
}