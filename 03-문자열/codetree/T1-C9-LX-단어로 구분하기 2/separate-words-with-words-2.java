import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split(" ");
        int cnt = 1;
        for (String item : arr) {
            if (cnt % 2 == 0) {
                cnt++;
                continue;
            }
            System.out.println(item);
            cnt++;
        }
            
    }
}