import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] words = new String [N];
        
        for (int i = 0; i < N; i++) {
            words[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        float cnt = 0;
        int sum = 0;

        for (String item : words) {
            if (item.charAt(0) == c) {
                cnt++;
                sum += item.length();
            }
        }
        System.out.printf("%.0f %.2f", cnt, sum/cnt);
    }
}