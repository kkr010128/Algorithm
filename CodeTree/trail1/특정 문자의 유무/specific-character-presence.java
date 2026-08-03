import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        System.out.print(line.contains("ee") ? "Yes " : "No ");
        System.out.print(line.contains("ab") ? "Yes" : "No");
        
    }
}