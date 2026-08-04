import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        sb.deleteCharAt(1);
        sb.deleteCharAt(sb.length()-2);
        System.out.println(sb);
    }
}