import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [101];
        
        while(n > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            for (int i = a; i <= b; i++) {
                arr[i] += 1;
            }
            n--;
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);
    }
}
