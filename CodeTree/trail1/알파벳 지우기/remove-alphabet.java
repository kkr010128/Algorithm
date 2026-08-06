import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        for(int i = 0; i < sb1.length(); i++) {
            if(Character.isLetter(sb1.charAt(i))) {
                sb1.deleteCharAt(i);
                i--;
            }
        }
        for(int i = 0; i < sb2.length(); i++) {
            if(Character.isLetter(sb2.charAt(i))) {
                sb2.deleteCharAt(i);
                i--;
            }
        }
        System.out.printf("%d", Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()));
    }
}
