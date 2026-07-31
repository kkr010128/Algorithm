import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] words = new String [10];
        
        for (int i = 0; i < 10; i++) {
            words[i] = sc.next();
        }
        
        char key = sc.next().charAt(0);
        boolean flag = false;
        
        for (int i = 0; i < 10; i++) {
            if(words[i].charAt(words[i].length()-1) == key) {
                System.out.println(words[i]);
                flag = true;
            }
        }
        if(flag == false) System.out.print("None");
    }
}