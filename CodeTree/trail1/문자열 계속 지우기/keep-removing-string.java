import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String B = sc.next();
        int idx;

        while (sb.toString().contains(B)) {
            idx = sb.indexOf(B);
            sb.delete(idx, idx + B.length());
        }
        System.out.println(sb);
    }
}