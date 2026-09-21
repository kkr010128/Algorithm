import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        arr[0] = 1;
        arr[1] = n;

        int idx = 2;

        while (true) {
            arr[idx] = arr[idx - 1] + arr[idx - 2];

            if (arr[idx] > 100) {
                idx++;
                break;
            }

            idx++;
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}