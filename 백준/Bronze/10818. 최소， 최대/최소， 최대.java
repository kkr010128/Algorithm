import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.printf("%d %d", arr[0], arr[arr.length - 1]);
    }
}