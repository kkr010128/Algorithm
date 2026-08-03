import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder evenChar = new StringBuilder();
        String line = sc.next();

    if (line.length() > 2) {
        for (int i = 1; i < line.length(); i += 2) {
            evenChar.append(line.charAt(i));
        }
        System.out.print(evenChar.reverse());
    }
    }
}