import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            int[] nums = new int[num];

            for (int j = 0; j < num; j++) { // 배열에 숫자 삽입
                nums[j] = sc.nextInt();
            }

            int max = nums[num - 1]; // 가장 마지막 값을 max로 두고 왼쪽과 비교
            long sum = 0;
            int profit = 0;

            for (int j = num - 2; j >= 0; j--) { // 끝에서 두 번째부터, 0까지
                if (nums[j] < max) {
                    profit = max - nums[j];
                    sum += profit;
                } else if (nums[j] > max) {
                    max = nums[j]; // 비교 대상이 더 클 때 max 교체
                }
            }
            System.out.printf("#%d %d\n", i + 1, sum);
        }
    }
}