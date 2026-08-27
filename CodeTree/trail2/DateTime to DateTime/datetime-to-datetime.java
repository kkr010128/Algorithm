import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt(), hour = sc.nextInt(), minute = sc.nextInt();
        int result;
        if(day < 11 || (day <= 11 && hour < 11) || (day <= 11 && hour <= 11 && minute < 11)) result = -1;
        else if (day == 11) result = 60 * (hour - 11) + (minute - 11);
        else result = 1440 * (day - 11) + 60 * (hour - 11) + (minute - 11);
        System.out.print(result);
    }
}