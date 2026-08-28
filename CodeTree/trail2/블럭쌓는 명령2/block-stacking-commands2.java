import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [sc.nextInt()+1];
        int k = sc.nextInt();

        while(k > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            for(int i = a; i <= b; i++) arr[i] += 1;
            k--;
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);
    }
}