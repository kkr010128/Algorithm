import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        int[] idx = new int[26];

        // initialize charactor
        Arrays.fill(idx, -1);
        // calculate ASICII(char-97) and save index
        for (int i = 0; i < s.length; i++) {
            if (idx[s[i] - 97] == -1) {
                idx[s[i] - 97] = i;
            }
        }
        // printf
        for (int i = 0; i < idx.length; i++) {
            System.out.printf("%d ", idx[i]);
        }
    }
}