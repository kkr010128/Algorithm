import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxLenght = 1;
        int countRepeat = 1;
        boolean previousSign, currentSign;
        
        previousSign = (sc.nextInt() > 0) ? true : false;
        
        for(int i = 1; i < N; i++) {
            currentSign = (sc.nextInt() > 0) ? true : false;
            if(previousSign == currentSign) {
                countRepeat++;
                maxLenght = (maxLenght <= countRepeat) ? countRepeat : maxLenght;
            } else countRepeat = 1;
            previousSign = currentSign;
        }
        System.out.print(maxLenght);
    }
}