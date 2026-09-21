import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [sc.nextInt()];
        int k = sc.nextInt();

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.print(a[k-1]);
    }
}