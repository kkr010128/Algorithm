import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = getGCD(a, b);
        printLCM(gcd, a, b);
    }
    
    public static void printLCM(int gcd, int a, int b) {
        int lcm = (a * b)/gcd;
        System.out.println(lcm);
    }


    public static int getGCD(int a, int b) {
        int gcd = 1;
        int max = a > b ? b : a;
        
        for (int cnt = max; cnt > 0; cnt--) {
            if (a % cnt == 0 && b % cnt == 0) {
                gcd = cnt;
                break;
            }
        }
        return gcd;
    }
}