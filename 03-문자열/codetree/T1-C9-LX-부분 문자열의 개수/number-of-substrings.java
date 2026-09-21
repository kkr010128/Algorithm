import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        String ptrn = sc.next();
        int cnt = 0;

        for (int i = 0; i <= line.length() - 1; i++) {
            if (line.charAt(i) == ptrn.charAt(0)) {
                if (line.charAt(i + 1) == ptrn.charAt(1))
                cnt++;
            } else continue;
        }
        System.out.print(cnt);
    }
}
            
            
            
            // for (int j = 0; j < ptrn.length(); j++) {
            //     if (line.charAt(i) == ptrn.charAt(j)) {
            //         cnt++;
            //         continue;
            //     }
            //     else break;
            // }