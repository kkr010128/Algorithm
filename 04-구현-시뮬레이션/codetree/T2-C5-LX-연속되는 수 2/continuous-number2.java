import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCount = 1;
        
        int N = sc.nextInt();
        int previousDigit = sc.nextInt();
        int currentCount = 1;
        
        for (int i = 1; i < N; i++) {
            int nextDigit = sc.nextInt();
            if(previousDigit == nextDigit) {
                currentCount++;
                maxCount = (maxCount <= currentCount) ? currentCount : maxCount;
            }
            else {
                previousDigit = nextDigit;
                currentCount = 1;
            }
        }
        System.out.print(maxCount);

    }
}