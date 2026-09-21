import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isIncrease;
        int previousNum = 0;
        int countIncrease = 1;
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            int currentNum = sc.nextInt();
            countIncrease = previousNum < currentNum ? ++countIncrease : 1;
            maxLength = maxLength < countIncrease ? ++maxLength : maxLength;
            previousNum = currentNum;
        }
        System.out.print(maxLength);
    }
}