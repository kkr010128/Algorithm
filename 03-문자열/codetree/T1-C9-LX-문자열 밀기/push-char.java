import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String s = sb.toString();
        
        sb.deleteCharAt(0);
        sb.insert(sb.length(), s.charAt(0));

        System.out.println(sb);
    }
}