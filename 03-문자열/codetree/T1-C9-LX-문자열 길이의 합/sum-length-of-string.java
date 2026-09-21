import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        String sentence;
        
        for (int i = 0; i < N; i++) {
            sentence = sc.next();
            if (sentence.charAt(0) == 'a') cnt++;
            sum += sentence.length();
        }
        System.out.printf("%d %d", sum, cnt);
    }
}