import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        StringBuilder sb = new StringBuilder();
        String result;

        int cnt = 0;
        char c = line.charAt(0); // 첫 문자로 초기화


        for (int i = 0; i < line.length(); i++) {
            // 현재 문자가 전의 문자와 동일하다면
            if (line.charAt(i) == c) {
                cnt++;
            }
            // 동일하지 않다면
            // 중단된 문자의 압축 결과를 저장, 다음 문자 준비
            else {
                sb.append(c);
                sb.append(cnt);
                c = line.charAt(i);
                cnt = 1;
            }
        }
        sb.append(c);
        sb.append(cnt);
        result = sb.toString();
        System.out.printf("%d\n%s", result.length(), result);
    }
}