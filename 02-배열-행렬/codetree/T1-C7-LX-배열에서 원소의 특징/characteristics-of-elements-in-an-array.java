import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        for(int i = 1; i < 9; i++) {
            int n = sc.nextInt();
            if (n % 3 == 0) {
                System.out.printf("%d", tmp);
                break;
            }
            tmp = n;

        }
        
    }
}