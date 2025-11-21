import java.util.Scanner;

//import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		String testInput = """
//				3
//				7
//				15 15 15 15 15 15 15
//				10
//				1 1 1 1 1 1 1 1 1 100
//				7
//				2 7 1 8 2 8 4
//							""";
//		System.setIn(new java.io.ByteArrayInputStream(testInput.getBytes()));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) { // 전체 테스트케이스 갯

			int nums = sc.nextInt(); // 입력 받을 숫자의 갯수
			int sum = 0;
			int[] people = new int[nums];

			for (int j = 0; j < nums; j++) { // 숫자의 갯수만큼 입력 받고 평균 계
				int tmp = sc.nextInt();
				sum += tmp;
				people[j] = tmp;
			}

			int avg = sum / nums;

			int cnt = 0;

			for (int j = 0; j < nums; j++) {
				if (people[j] <= avg) {
					cnt++;
				}
			}
			System.out.printf("#%d %d\n", i, cnt);
		}

	}
}