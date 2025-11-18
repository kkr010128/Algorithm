import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 전체 테스트 케이스 수

        for (int tc = 1; tc <= T; tc++) {

            int caseNum = sc.nextInt(); // 문제에서 주는 테스트케이스 번호

            int[] scores = new int[101];
            Arrays.fill(scores, 0);

            int mstFrqncy = 0;
            int frqncyScore = 0;

            for (int i = 0; i < 1000; i++) {
                int score = sc.nextInt();
                int cnt = ++scores[score];

                if (cnt > mstFrqncy || (cnt == mstFrqncy && score > frqncyScore)) {
                    mstFrqncy = cnt;
                    frqncyScore = score;
                }
            }

            System.out.printf("#%d %d\n", caseNum, frqncyScore);
        }
    }
}