import java.util.Scanner;

public class Main {

    static int[] months = {
        0, 31, 29, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    static String[] dates = {
        "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        String targetDate = sc.next();

        int day1 = convertToDay(m1, d1), day2 = convertToDay(m2, d2);

        int start = Math.min(day1, day2), end = Math.max(day1, day2);
        int targetIndex = getDateIndex(targetDate);

        int result = 0;

        for (int day = start; day <= end; day++) {
            int dateIndex = (day - day1) % 7;

            if (dateIndex < 0) {
                dateIndex += 7;
            }

            if (dateIndex == targetIndex) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static int convertToDay(int month, int day) {
        int sum = 0;

        for (int i = 1; i < month; i++) {
            sum += months[i];
        }

        return sum + day;
    }

    private static int getDateIndex(String targetDate) {
        for (int i = 0; i < dates.length; i++) {
            if (dates[i].equals(targetDate)) {
                return i;
            }
        }

        return -1;
    }
}

/*
    처음에는 두 날짜의 방향을 판단하고 정방향/역방향에 따라
    월별 날짜 차이를 따로 계산하는 방식을 고려했다.

    하지만 월이 바뀌는 경계에서 별도의 처리가 계속 필요해져,
    각 날짜를 해당 연도의 몇 번째 날인지 나타내는 값으로 변환하였다.

    예:
    2월 29일 → 60
    3월 1일  → 61

    두 날짜를 일수로 변환한 뒤 작은 값을 start, 큰 값을 end로 설정하고,
    start부터 end까지 순회하면서 기준 날짜인 day1과의 차이로 요일을 계산하였다.

    코드 리뷰(GPT):
    월/일을 하나의 연중 일수로 변환하면서 기존 풀이보다 구조가 단순해졌다.
    특히 정방향과 역방향을 별도의 메서드로 처리할 필요가 없고,
    2월 29일 → 3월 1일 같은 월 경계도 자연스럽게 처리된다.

    요일은 day1을 Monday(index 0)로 두고
    (day - day1) % 7을 통해 계산한다.

    단, Java에서는 음수에 대한 나머지 연산의 결과도 음수가 될 수 있다.
    예를 들어 -1 % 7은 -1이므로,
    day1보다 이전 날짜를 계산할 때는 +7을 하여 0~6 범위로 보정하였다.

    현재 풀이에서는 최대 366일을 순회하므로
    시간복잡도는 O(366), 연도의 날짜 수가 고정되어 있어 사실상 O(1)이다.

    공간복잡도: O(1)

    추가로 getDateIndex()에서 targetDate를 찾지 못하면 -1을 반환하지만,
    문제에서 유효한 요일만 입력된다는 것이 보장된다면 별도 예외 처리는 필요하지 않다.
*/