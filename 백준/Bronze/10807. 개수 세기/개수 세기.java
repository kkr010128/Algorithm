import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int contains = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int toFind = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == toFind)
                contains++;
        }
        System.out.println(contains);
    }
}