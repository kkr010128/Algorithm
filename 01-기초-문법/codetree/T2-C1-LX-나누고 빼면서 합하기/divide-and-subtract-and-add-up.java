import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(cal(m, arr));
    }

    private static int cal(int m, int[] arr) {
        int sum = 0;
        while(m != 1) {
            sum += arr[m-1];
            if(m % 2 == 0) {
                m = m/2;
            } else m--;
        }
        sum += arr[m-1];
        return sum;
    }
}