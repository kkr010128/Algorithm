import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;
        int idx = 0;

        for (int i = 1; ; i++) {
            arr[idx] = n * i;

            if (arr[idx] % 5 == 0) {
                cnt++;
            }

            idx++;

            if (cnt == 2) {
                break;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}