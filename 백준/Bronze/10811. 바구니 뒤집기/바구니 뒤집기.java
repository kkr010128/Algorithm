import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] basket = new int[sc.nextInt()];
        int repeat = sc.nextInt();

        // assign values
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        // swap values
        for (int j = 0; j < repeat; j++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            while (from < to) {
                int temp = basket[from];
                basket[from] = basket[to];
                basket[to] = temp;
                from++;
                to--;
            }
        }
        for (int k = 0; k < basket.length; k++) {
            System.out.printf("%d ", basket[k]);
        }
    }
}