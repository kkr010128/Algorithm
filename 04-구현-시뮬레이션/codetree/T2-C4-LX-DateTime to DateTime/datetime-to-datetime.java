import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt(), hour = sc.nextInt(), minute = sc.nextInt();
        int result;
        if(day < 11 || (day <= 11 && hour < 11) || (day <= 11 && hour <= 11 && minute < 11)) result = -1;
        else if (day == 11) result = 60 * (hour - 11) + (minute - 11);
        else result = 1440 * (day - 11) + 60 * (hour - 11) + (minute - 11);
        System.out.print(result);
    }
}
/*
    기준 시각인 11일 11시 11분과 입력받은 시각을 비교한 뒤,
    기준 시각보다 이전이면 -1을 출력하고,
    이후라면 날짜, 시간, 분의 차이를 모두 분 단위로 변환하여 계산하였다.

    코드 리뷰(GPT):
    전체적인 접근과 계산식은 적절하며 정상적으로 동작한다.

    다만 기준 시각 이전인지 판단하는 조건에서
    day <= 11이 반복되고 있어 조건을 조금 단순화할 수 있다.

    현재 조건:
    day < 11
    || (day <= 11 && hour < 11)
    || (day <= 11 && hour <= 11 && minute < 11)

    day가 11보다 작은 경우는 첫 번째 조건에서 이미 처리되므로,
    나머지는 day == 11인 경우만 확인하면 의미가 더 명확하다.

    또는 날짜, 시간, 분을 처음부터 모두 '분'으로 변환하면
    별도의 복잡한 시각 비교 없이 두 값의 차이만으로 처리할 수도 있다.

    시간복잡도: O(1)
    공간복잡도: O(1)
*/