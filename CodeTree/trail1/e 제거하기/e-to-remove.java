import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        System.out.println(sb.deleteCharAt(sb.toString().indexOf('e')));

    }
}