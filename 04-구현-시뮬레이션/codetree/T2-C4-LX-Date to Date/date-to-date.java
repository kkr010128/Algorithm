import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int fromMonth = sc.nextInt(), fromDay = sc.nextInt(), toMonth = sc.nextInt(), toDay = sc.nextInt();
        
        if(fromMonth == toMonth) System.out.print(toDay - fromDay +1);
        else {
            int sum = 0;

            for(int i = fromMonth + 1; i < toMonth; i++) {
                if(fromMonth + 1 > 12) break;
                sum += days[i];
            }
            System.out.printf("%d", sum + days[fromMonth] - fromDay + 1 + toDay);
        }
        
    }
}

/*
    월별 일수를 배열에 저장하고,
    시작 월과 종료 월이 같은 경우와 다른 경우를 나누어 계산하였다.

    같은 월인 경우:
    종료일 - 시작일 + 1로 계산한다.

    다른 월인 경우:
    시작 월의 남은 날짜 + 두 날짜 사이에 완전히 포함된 월의 날짜 + 종료 월의 날짜
    방식으로 전체 날짜 수를 계산하였다.

    코드 리뷰(GPT):
    현재 계산 방식은 문제의 조건에 맞게 동작한다.
    시작 날짜도 포함하므로 시작 월의 남은 날짜를 계산할 때 +1을 하는 것이 중요하다.

    다만 반복문 내부의
    if (fromMonth + 1 > 12) break;
    조건은 필요하지 않다.

    fromMonth는 반복문에서 변하지 않으며,
    i < toMonth 조건에 의해 반복 범위가 이미 제한되기 때문이다.

    시간복잡도: O(12) → 월의 개수가 고정되어 있으므로 사실상 O(1)
    공간복잡도: O(1)
*/