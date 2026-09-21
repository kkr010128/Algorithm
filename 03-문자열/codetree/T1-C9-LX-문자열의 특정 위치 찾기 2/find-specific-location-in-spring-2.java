import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] words = {"apple", "banana", "grape", "blueberry", "orange"};
        int cnt = 0;
        char c = sc.next().charAt(0);

        for (int i = 0; i < 5; i++) {
            if(words[i].charAt(2) == c || words[i].charAt(3) == c) {
                System.out.println(words[i]);
                cnt++;
            }
        }
        System.out.printf("%d", cnt);
    }
}