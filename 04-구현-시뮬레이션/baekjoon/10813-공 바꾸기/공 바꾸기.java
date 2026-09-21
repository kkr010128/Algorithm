import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] N = new int[sc.nextInt()];
        int M = sc.nextInt();
        int tmp;

        // initialize ballNumber
        for (int a = 0; a < N.length; a++) {
            N[a] = a + 1; // 1 2 3 4 5
        }

        // swap balls
        for (int b = 0; b < M; b++) { // repeat lines
            int i = sc.nextInt(); // 1
            int j = sc.nextInt(); // 2

            tmp = N[i - 1]; // tmp = N[0] : 1
            N[i - 1] = N[j - 1];
            N[j - 1] = tmp;
        }

        // print values
        for (int k = 0; k < N.length; k++) {
            System.out.printf("%d ", N[k]);
        }
    }
}