import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[sc.nextInt()]; // 5
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int ballNumber = sc.nextInt();
            for (int j = start; j <= end; j++) {
                N[j] = ballNumber;
            }
        }
        for (int k = 0; k < N.length; k++) {
            System.out.printf("%d ", N[k]);
        }
    }
}