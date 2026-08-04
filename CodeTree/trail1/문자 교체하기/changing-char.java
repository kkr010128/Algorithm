import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
        sb.setCharAt(0, st.charAt(0));
        sb.setCharAt(1, st.charAt(1));
        System.out.print(sb.toString());
    }
}