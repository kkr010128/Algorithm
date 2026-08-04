import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        char a = sb.charAt(0);
        char b = sb.charAt(1);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == a) sb.setCharAt(i, b);
            else if (sb.charAt(i) == b) sb.setCharAt(i, a);
        }
        System.out.print(sb.toString());
    }
}