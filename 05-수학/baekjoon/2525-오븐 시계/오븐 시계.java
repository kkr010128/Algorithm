import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (B + C > 59) {
            A += (B + C) / 60;
            if (A >= 24)
                A -= 24;
            B = (B + C) % 60;
        } else {
            B += C;
        }
        System.out.println(A + " " + B);
    }
}