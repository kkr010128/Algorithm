import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int R = sc.nextInt();
            String S = sc.next();
            StringBuilder sb = new StringBuilder();
            for (char c : S.toCharArray()) {
                for (int i = 0; i < R; i++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
        sc.close();
    }
}