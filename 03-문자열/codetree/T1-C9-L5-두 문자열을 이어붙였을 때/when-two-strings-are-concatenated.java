import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        String cmp1 = line1+line2;
        String cmp2 = line2+line1;
        System.out.print(cmp1.substring(0, 2).equals(cmp2.substring(0, 2)) ? "true" : "false");
    }
}