import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        
        char c = sb.charAt(0);
        char cc = sb.charAt(1);
        
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == cc) sb.setCharAt(i, c);
        }
        System.out.println(sb);
    }
}