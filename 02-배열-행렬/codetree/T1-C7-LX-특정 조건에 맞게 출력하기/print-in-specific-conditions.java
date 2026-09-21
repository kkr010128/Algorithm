import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int idx = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr[idx++] = n;
        }

        for (int i = 0; i < idx; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 3;
            } else {
                arr[i] /= 2;
            }

            System.out.print(arr[i] + " ");
        }
    }
}