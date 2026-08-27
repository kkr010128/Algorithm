import java.util.Scanner;

public class Main {
    private static int fromMonth, fromDay, toMonth, toDay;
    private static int [] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] dates = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String [] reverseDates = {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};

        int diffDays;
        boolean isReverse = false;

        fromMonth = sc.nextInt();
        fromDay = sc.nextInt();
        toMonth = sc.nextInt();
        toDay = sc.nextInt();

        if (fromMonth == toMonth && fromDay == toDay) diffDays = 0;
        else if (fromMonth < toMonth || fromMonth == toMonth && fromDay < toDay) diffDays = plusDiffDays();
        else {
            diffDays = minusDiffDays();
            isReverse = true;
        }
        

        System.out.print(isReverse ? reverseDates[getDate(diffDays)] : dates[getDate(diffDays)]);
    }

    private static int minusDiffDays() {
        int sumDays = 0;
        for (int i = toMonth; i < fromMonth; i++) {
            sumDays += months[i];
        }
        return  sumDays - toDay + fromDay;
    }

    private static int plusDiffDays() {
        int sumDays = 0;
        for (int i = fromMonth; i < toMonth; i++) {
            sumDays += months[i];
        }
        return  sumDays - fromDay + toDay;
    }

    private static int getDate(int diffDays) {
        return diffDays >= 7 ? diffDays % 7 : diffDays;
    }
}
/*
    접근 방법:
    기준 날짜에서 목표 날짜까지의 차이를 일(day) 단위로 계산하고,
    목표 날짜가 미래인지 과거인지에 따라 요일 배열을 다르게 사용하였다.

    미래 방향:
        dates = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}

    과거 방향:
        reverseDates = {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"}

    예를 들어 기준 요일이 Monday이고 하루 이전이면
    reverseDates[1] = "Sun"이 되므로 원하는 결과를 얻을 수 있다.

    코드 리뷰(GPT):
    이전 코드에서 plusDiffDays()와 minusDiffDays()가 모두 양수 거리만 반환하여
    getDate()에서는 이동 방향을 알 수 없었던 문제가 있었다.

    현재 코드는 isReverse를 추가하여
    미래 방향과 과거 방향을 명확하게 구분했기 때문에 해당 문제가 해결되었다.

    getDate()의
        return diffDays >= 7 ? diffDays % 7 : diffDays;
    는 정상적으로 동작하지만,
    diffDays가 7보다 작아도 diffDays % 7의 결과는 동일하므로
    다음처럼 단순화할 수 있다.

        return diffDays % 7;

    현재 방식은 요일 배열을 두 개 사용하는 구조라 이해하기 쉽다는 장점이 있다.
    다만 같은 요일 정보를 정방향/역방향으로 중복 저장한다는 점은 있다.

    시간복잡도:
    월 배열을 최대 12개 순회하므로 O(12), 사실상 O(1)

    공간복잡도:
    고정 크기 배열만 사용하므로 O(1)
*/