import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int cost, quarter, dime, nickel, penny;

        for (int i = 0; i < times; i++) {
            cost = sc.nextInt();

            quarter = cost / 25;
            cost %= 25;

            dime = cost / 10;
            cost %= 10;

            nickel = cost / 5;
            cost %= 5;

            penny = cost;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}