import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            System.out.print(Character.isUpperCase(tmp) ? Character.toLowerCase(tmp) : Character.toUpperCase(tmp));
        }
    }
}