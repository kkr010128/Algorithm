import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[sc.nextInt()];
        float highest = 0;
        float sum = 0;

        // assign and extract highest value
        for (int i = 0; i < arr.length; i++) {
            int tmp = sc.nextInt();
            arr[i] = tmp;
            if (tmp > highest)
                highest = tmp;
        }
        // replace value to average score
        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[j] / highest * 100;
        }

        // calculate new average
        for (int k = 0; k < arr.length; k++) {
            sum += arr[k];
        }

        // print average
        System.out.printf("%f", sum / arr.length);
    }
}