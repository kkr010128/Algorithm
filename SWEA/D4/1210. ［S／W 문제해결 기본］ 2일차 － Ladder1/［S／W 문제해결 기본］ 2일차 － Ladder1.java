import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) { // test case는 10개
            int caseNum = sc.nextInt();
            int[][] ladder = new int[100][100];
            int ptrX = 0;
            int ptrY = 0;
            // 입력값 배열에 저장 및 도착지 좌표 저장
            for (int row = 0; row < 100; row++) {
                for (int col = 0; col < 100; col++) {
                    int value = sc.nextInt();
                    if (value == 2) {
                        ladder[row][col] = value;
                        ptrX = row;
                        ptrY = col;
                    } else
                        ladder[row][col] = value;
                }
            }
            // 도착지 -> 출발지로 역탐색
            // ptrX는 row(행), ptrY는 col(열)
            // 아래(99행)에서 위(0행)로 올라가야 함
            while (ptrX > 0) {
                // 좌우 확인 (범위 체크 필수)

                // 왼쪽으로 갈 수 있는지 확인
                if (ptrY > 0 && ladder[ptrX][ptrY - 1] == 1) {
                    ptrY--;
                    // 왼쪽으로 계속 이동
                    while (ptrY > 0 && ladder[ptrX][ptrY - 1] == 1) {
                        ptrY--;
                    }
                }
                // 오른쪽으로 갈 수 있는지 확인 (왼쪽으로 안 갔을 때만)
                else if (ptrY < 99 && ladder[ptrX][ptrY + 1] == 1) {
                    ptrY++;
                    // 오른쪽으로 계속 이동
                    while (ptrY < 99 && ladder[ptrX][ptrY + 1] == 1) {
                        ptrY++;
                    }
                }

                // 위로 한 칸 이동
                ptrX--;
            }

            // 출발지(0행)에 도착하면 해당 열(ptrY) 출력
            System.out.printf("#%d %d\n", caseNum, ptrY);

        }
    }
}
