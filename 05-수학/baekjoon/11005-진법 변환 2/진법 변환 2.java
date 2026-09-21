// 11005번: 진법 변환 2
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B= Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int R = N % B;
            if (R < 10) {
                sb.append((char) (R + '0'));
            } else {
                sb.append((char) (R - 10 + 'A'));
            }
            N /= B;
        }

        // 나머지가 역순으로 저장됐으므로 반대로 출력
        System.out.println(sb.reverse().toString());
        
    }
}