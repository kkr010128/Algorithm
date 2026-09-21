import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printS(sc.nextInt());
    }

    public static void printS(int a) {
        int cnt = 1;
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.printf("%d ", cnt);
                cnt = cnt < 9 ? cnt+1 : 1;
            }
            System.out.println();
        }

    }
}
