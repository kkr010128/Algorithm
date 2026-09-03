import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[100];
        int idx = 0;

        while(true) {
            arr[idx] = sc.nextInt();
            if(arr[idx] == 0) break;
            idx++;
        }
        int sum = arr[idx-1] + arr[idx-2] + arr[idx-3];
        System.out.println(sum);
    }
}