import java.util.Scanner;

public class Main {
    
    static int [] a = new int [50];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            insert(i , sc.nextInt());
        }
        
        for(int i = 0; i < num; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    public static void insert(int i, int n) {
        if (n < 0) a[i] = n * -1;
        else a[i] = n;
    }
}