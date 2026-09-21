import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String [] season = {
            "Winter",
            "Winter",
            "Spring",
            "Spring",
            "Spring",
            "Summer",
            "Summer",
            "Summer",
            "Fall",
            "Fall",
            "Fall",
            "Winter"
            };

        int result = getSeasonNum(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        System.out.print(result != -1 ? season[result] : -1);
    }

    public static int getSeasonNum(int y, int m, int d) {
        if(isDateExists(y, m, d)) return m-1;
        return -1;
    }
    
    public static boolean isDateExists(int y, int m, int d) {
        ArrayList<Integer> baskinrobbins = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        if (isLeapYear(y) && m == 2 && d < 30) return true;
        if (m == 2 && d < 29) return true;
        if (baskinrobbins.contains(m) && d < 32) return true;
        if (m != 2 && !baskinrobbins.contains(m) && d < 31) return true;
        return false;
    }

    public static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 != 0) return true;
            if (y % 400 == 0) return true;
        }
        return false;
    }

}
/*
    접근 방법:
    월별 계절을 season 배열에 직접 저장하고,
    입력된 연/월/일이 실제로 존재하는 날짜인지 확인한 뒤
    월을 배열 인덱스로 변환하여 해당 계절을 출력하였다.

    날짜 검사는
    2월 / 31일까지 존재하는 달 / 30일까지 존재하는 달로 나누어 처리하고,
    2월은 윤년 여부를 추가로 확인하였다.

    코드 리뷰(GPT):
    전체 구조는 잘 나뉘어 있다.

    getSeasonNum()은 날짜 유효성 검사와 계절 인덱스 계산만 담당하고,
    isDateExists()는 날짜 존재 여부,
    isLeapYear()는 윤년 판별만 담당하므로 역할이 명확하다.

    season 배열도 월과 인덱스를 직접 대응시키므로
    별도의 계절 계산식을 만들 필요가 없어 직관적이다.

    isLeapYear()의 윤년 판별도 정확하다.

    다만 isDateExists()는 조건을 조금 더 간결하게 만들 수 있다.

    현재:
    if (isLeapYear(y) && m == 2 && d < 30) return true;
    if (m == 2 && d < 29) return true;

    개선:
    if (m == 2) {
        return d <= (isLeapYear(y) ? 29 : 28);
    }

    또한 31일인 달을 판별한 뒤에는
    남은 달이 모두 30일인 달이므로 마지막 조건도 단순화할 수 있다.

    public static boolean isDateExists(int y, int m, int d) {
        ArrayList<Integer> months31 =
                new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

        if (m == 2) {
            return d <= (isLeapYear(y) ? 29 : 28);
        }

        if (months31.contains(m)) return d <= 31;

        return d <= 30;
    }

    변수명 baskinrobbins는 의미를 바로 파악하기 어렵기 때문에
    months31처럼 역할이 드러나는 이름이 더 적절하다.

    시간복잡도:
    O(1)

    공간복잡도:
    O(1)
*/