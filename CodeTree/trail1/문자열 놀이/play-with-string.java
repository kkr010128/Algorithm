import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int n = sc.nextInt();
        int a, b;
        char x, y, tmp;
        int query;

        for (int i = 0; i < n; i++) {
            query = sc.nextInt();
            if (query == 1) {
                a = sc.nextInt() - 1;
                b = sc.nextInt() - 1;
                tmp = sb.charAt(a);
                sb.setCharAt(a, sb.charAt(b));
                sb.setCharAt(b, tmp);
                System.out.println(sb.toString());
            }
            else if (query == 2) {
                x = sc.next().charAt(0);
                y = sc.next().charAt(0);
                for (int j = 0; j < sb.length(); j++) {
                    if (sb.charAt(j) == x) sb.setCharAt(j, y);
                }
                System.out.println(sb.toString());
            }
        }
    }
}