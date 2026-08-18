import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bomb bomb = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt());
        System.out.printf("code : %s\ncolor : %c\nsecond : %d", bomb.code, bomb.color, bomb.sec);
    }
}

class Bomb {
    String code;
    char color;
    int sec;
    public Bomb(String code, char color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
}