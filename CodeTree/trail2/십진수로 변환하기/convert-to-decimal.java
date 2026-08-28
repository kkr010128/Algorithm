import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int cnt = 1;

        while(num > 0) {
            result += cnt * (num % 10);
            cnt *= 2;
            num = num / 10;
        }
        System.out.print(result);
    }
}