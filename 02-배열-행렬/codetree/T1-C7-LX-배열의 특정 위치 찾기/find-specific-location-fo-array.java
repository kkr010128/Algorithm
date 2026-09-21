import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];

        int evenSum = 0;
        int multipleSum = 0;
        int multipleCnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if((i+1) %2 == 0) evenSum += arr[i];
            if((i+1) %3 == 0) {
                multipleSum += arr[i];
                multipleCnt++;
            }
        }
        double avg = (double)multipleSum / multipleCnt;
        System.out.printf("%d %.1f", evenSum, avg);
    }
}