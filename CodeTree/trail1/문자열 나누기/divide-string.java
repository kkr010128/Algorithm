import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            sb.append(sc.next());
        }
        
        String line = sb.toString();
        int cnt = 0;        

        for(int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            cnt++;

            if(cnt == 5) {
                System.out.println();
                cnt = 0;
            }
        }
    }
}