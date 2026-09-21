import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String ptrn = sc.next();
        System.out.print(checkIdx(line, ptrn));
    }

    private static int checkIdx(String line, String ptrn) {
        return line.indexOf(ptrn);
    }
}