import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day [] days = new Day [sc.nextInt()];
        
        for(int i = 0; i < days.length; i++) {
            days[i] = new Day(sc.next(), sc.next(), sc.next());
        }
        Arrays.sort(days, Comparator.comparing(d -> d.date));
        for(int i = 0; i < days.length; i++) {
            if(days[i].weather.equals("Rain")) {
                System.out.printf("%s %s %s", days[i].date, days[i].day, days[i].weather);
                break;
            }
        }
    }
}

class Day {
    String date;
    String day;
    String weather;
    
    public Day (String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
/*
    접근 방법:
    날짜, 요일, 날씨 정보를 Day 객체로 묶어 배열에 저장하였다.

    이후 date를 기준으로 오름차순 정렬한 뒤,
    앞에서부터 순회하면서 weather가 "Rain"인 첫 번째 객체를 찾았다.

    날짜 형식이 yyyy-mm-dd로 고정되어 있으므로
    문자열 사전순 정렬 결과와 실제 날짜 순서가 일치한다.

    코드 리뷰(GPT):
    현재 풀이가 적절하며 정답이다.

    Arrays.sort(days, Comparator.comparing(d -> d.date))로
    날짜가 빠른 순서대로 정렬한 뒤 첫 번째 Rain을 찾는 방식이 명확하다.

    Rain을 찾자마자 break 하므로
    가장 가까운 비 오는 날만 출력하고 탐색을 종료한다.

    Day 객체에 date, day, weather를 함께 저장했기 때문에
    정렬 후에도 각 정보의 연결 관계가 유지된다.

    시간복잡도는 정렬 O(N log N),
    이후 탐색 O(N)이므로 전체 O(N log N)이다.

    다만 이 문제는 정렬 없이 입력 과정에서
    가장 빠른 Rain 날짜만 비교해서 찾는 O(N) 풀이도 가능하다.
    현재 문제 단원이 일반 정렬이므로 지금 방식이 학습 목적에는 잘 맞는다.
*/