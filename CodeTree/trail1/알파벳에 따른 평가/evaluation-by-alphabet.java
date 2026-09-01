import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alphabet = sc.next().charAt(0);

        System.out.printf("%s", alphabet == 'S' ? "Superior" : alphabet == 'A' ? "Excellent" : alphabet == 'B' ? "Good" : alphabet == 'C' ? "Usually" : alphabet == 'D' ? "Effort" : "Failure");
    }
}