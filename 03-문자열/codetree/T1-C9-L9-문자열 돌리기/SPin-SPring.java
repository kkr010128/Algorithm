import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String save = sb.toString();

        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            sb.insert(0, sb.charAt(save.length() - 1));
            sb.deleteCharAt(sb.length() - 1); // 끝 삭제
            System.out.println(sb);
        }
    }
}
/*
    insert와 deleteCharAt의 순서와
    idx 참조 주의
*/