import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        char find = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == find) cnt++;
        }
        System.out.print(cnt);

    }
}