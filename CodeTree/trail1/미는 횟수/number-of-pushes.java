import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String cmpTo = sc.next();
        int cnt = 0;
        int failed = 0;
        while(true) {
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
            cnt++;
            if(sb.toString().equals(cmpTo)) break;
            failed++;
            if(failed == cmpTo.length()) {
                cnt = -1;
                break;
            }
        }
        System.out.print(cnt);
    }
}