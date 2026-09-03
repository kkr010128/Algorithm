import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[10];
        int ods = 0;
        int evs = 0;
        
        for(int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();

            if(i%2 == 0) ods += a[i];
            else evs += a[i];
        }
        System.out.println(Math.abs(ods - evs));
    }
}