import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        int who;
        // assign students
        for (int j = 0; j < 28; j++) {
            who = sc.nextInt();
            arr[who - 1] = who;
        }
        // print absense
        for (int k = 0; k < 30; k++) {
            if (arr[k] == 0)
                System.out.println(k + 1);
        }
    }
}