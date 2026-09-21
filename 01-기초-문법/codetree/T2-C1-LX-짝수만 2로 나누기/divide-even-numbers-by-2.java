import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];
        
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            arr[i] = tmp % 2 == 0 ? tmp/2 : tmp;
            System.out.printf("%d ", arr[i]);
        }

    }
}