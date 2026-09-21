import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next();
        String line2 = sc.next();
        String line3 = sc.next();

        int [] sort = {line1.length(), line2.length(), line3.length()};
        Arrays.sort(sort);

        System.out.print(sort[2] - sort[0]);


    }
}