import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(isMultiple(n));
    }
    public static String isMultiple(int n) {
        if(n%2==0 && (n/10 + n%10) % 5 == 0) return "Yes";
        return "No";
    }
}
/*
    입력받은 정수가 2의 배수이면서,
    각 자리수의 합이 5의 배수인지 확인하여
    조건을 만족하면 "Yes", 아니면 "No"를 반환하는 방식이다.

    코드 리뷰(GPT):
    조건식 자체는 간결하고 정상적으로 동작한다.

    다만 메서드명이 isMultiple인데 반환 타입이 String인 점은
    Java 네이밍 관례상 조금 어색하다.

    is로 시작하는 메서드는 보통 boolean을 반환하는 형태가 자연스럽다.

    예:
    public static boolean isMultiple(int n)

    그리고 main에서 결과에 따라 "Yes", "No"를 출력하는 방식이 더 좋다.

    또한 (n / 10 + n % 10)은 두 자리 수라는 전제가 있을 때만
    각 자리수의 합으로 사용할 수 있다.

    시간복잡도는 O(1), 공간복잡도는 O(1)이다.
*/