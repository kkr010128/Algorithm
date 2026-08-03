import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int ee = 0;
        int eb = 0;

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == 'e' && line.charAt(i+1) == 'e') ee++;
            if (line.charAt(i) == 'e' && line.charAt(i+1) == 'b') eb++;
        }

        System.out.printf("%d %d", ee, eb);
    }
}

/* 
    기준이 되는 문자열로 split한 후 -1을 하는 방식을 생각했으나
    기준 문자열이 양 끝에 있을 경우 판단하기 어려운 문제가 있어 반복문으로 수행
*/