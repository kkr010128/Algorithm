import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int targetNumber = sc.nextInt();

        int maxLength = 0;
        int countBigger = 0;

        for (int i = 0; i < N; i++) {
            int currentNumber = sc.nextInt();
            countBigger = targetNumber < currentNumber ? ++countBigger : 0;
            if(countBigger != 0) {
                maxLength = maxLength <= countBigger ? countBigger : maxLength;
            }
        }
        System.out.print(maxLength);
    }
}