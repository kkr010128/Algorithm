import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = sc.nextInt();
        int cnt = 1;
        
        while (num > 0) {
            int mod = num % 10;
            result += mod * cnt;
            cnt *= 2;
            num = num/10;
        }
        System.out.print(result);
    }
}