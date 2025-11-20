import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int count = 0;
            int num = i;
            
            // 각 자릿수를 체크하여 3, 6, 9가 있는지 확인
            while (num > 0) {
                int digit = num % 10;
                if (digit == 3 || digit == 6 || digit == 9) {
                    count++;
                }
                num /= 10;
            }
            
            // 3, 6, 9가 있으면 그 개수만큼 "-" 출력, 없으면 숫자 출력
            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}
