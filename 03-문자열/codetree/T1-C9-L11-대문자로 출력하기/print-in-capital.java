import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        for (int i = 0; i < line.length(); i++) {
            if(('A' <= line.charAt(i) && line.charAt(i) <= 'Z') || ('a' <= line.charAt(i) && line.charAt(i) <= 'z')) {
                if ('a' <= line.charAt(i)) System.out.print((char)(line.charAt(i) -32));
                else System.out.print(line.charAt(i));
            }
        }
    }
}