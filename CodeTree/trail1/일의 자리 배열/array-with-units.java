import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int [] arr = {a, b, 0, 0, 0, 0, 0, 0, 0, 0};
        int cnt = 2;
        
        while(cnt < 10) {
            arr[cnt] = (arr[cnt-2] + arr[cnt-1]) % 10;
            cnt++;
        }
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}