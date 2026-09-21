import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] arr = sc.next().toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);
    }
}