import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();
        String result;

        if(m > 12 || d > 31) result = "No";
        else {
            result = isValidDate(m, d) ? "Yes" : "No";
        }
        System.out.print(result);
    }

    public static boolean isValidDate(int m, int d) {
        ArrayList<Integer> baskinrobbins = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        if (m == 2 && d < 29) return true;
        if (baskinrobbins.contains(m) && d < 32) return true;
        if (!baskinrobbins.contains(m) && d < 31 && m != 2) return true;
        else return false;
    }
}

/*
    접근 방법:
    2021년은 평년이므로 2월은 28일까지 있다고 두고,
    31일까지 있는 달을 별도 리스트로 관리해
    2월 / 31일인 달 / 30일인 달로 나누어 날짜의 유효성을 판별하였다.

    코드 리뷰(GPT):
    현재 코드는 문제 조건 기준으로 정상적으로 동작한다.

    main에서
    m > 12 || d > 31
    조건으로 존재할 수 없는 월과 일을 먼저 걸러내고 있다.

    isValidDate()에서는
    2월을 28일까지,
    baskinrobbins에 포함된 달을 31일까지,
    나머지 달을 30일까지 허용하도록 처리하였다.

    특히 이전 코드와 달리
    마지막 조건에 m != 2를 추가하여
    2월 29일이나 30일이 30일짜리 달 조건에 걸리는 문제를 해결했다.

    다만 아래 조건은 조금 더 간단하게 작성할 수 있다.

    if (m == 2 && d < 29)
    -> if (m == 2 && d <= 28)

    if (baskinrobbins.contains(m) && d < 32)
    -> if (baskinrobbins.contains(m) && d <= 31)

    if (!baskinrobbins.contains(m) && d < 31 && m != 2)
    -> if (!baskinrobbins.contains(m) && m != 2 && d <= 30)

    또는 2월을 먼저 return하면 이후 조건을 더 단순화할 수 있다.

    public static boolean isValidDate(int m, int d) {
        ArrayList<Integer> months31 =
                new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

        if (m == 2) return d <= 28;
        if (months31.contains(m)) return d <= 31;
        return d <= 30;
    }

    시간복잡도:
    O(1)

    공간복잡도:
    O(1)
*/