import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String q = sc.next();

        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) == 'L') {
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
            } else {
                sb.insert(0, sb.charAt(sb.length()-1));
                sb.deleteCharAt(sb.length()-1);
            }
        }
        System.out.println(sb);
    }
}