import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        while (sb.length() > 1) { // 5 4 3 2 
            int n = sc.nextInt(); //3 2 0 10
            if (sb.length() <= n) sb.deleteCharAt(sb.length()-1);
            else sb.deleteCharAt(n);
            System.out.println(sb);
        }
    }
}