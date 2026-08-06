import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String aa = "", bb =  "";

        for (int i = 0; i < a.length(); i++){
            if (Character.isDigit(a.charAt(i))) aa += a.charAt(i);
            else break;
        }
        for (int i = 0; i < b.length(); i++){
            if (Character.isDigit(b.charAt(i))) bb += b.charAt(i);
            else break;
        }
        System.out.print(Integer.parseInt(aa) + Integer.parseInt(bb));
    }
}

/*
    입력받은 두 문자열의 앞부분에 연속해서 등장하는 숫자만 추출한 뒤,
    각각 정수로 변환하여 합을 출력하는 방식으로 구현하였다.

    숫자가 아닌 문자를 만나면 반복을 종료하여
    문자열의 접두 숫자(prefix)만 추출하도록 구현하였다.

    코드 리뷰(GPT):

    접근 방식이 적절하다.
    각 문자열을 한 번씩만 순회하므로 시간복잡도는 O(N + M)이다.

    다만 문자열을

        aa += a.charAt(i);

    처럼 반복해서 이어 붙이면 매번 새로운 String 객체가 생성된다.
    입력이 길어질 경우 비효율적이므로 StringBuilder를 사용하는 것이 더 좋다.

    또한 숫자가 하나도 없는 입력이라면

        Integer.parseInt("")

    가 되어 NumberFormatException이 발생한다.

    문제에서 반드시 숫자로 시작한다고 보장하지 않는다면
    빈 문자열인지 확인하는 예외 처리가 필요하다.

    마지막으로 동일한 로직이 두 번 반복되고 있다.
    메서드로 분리하면 중복을 줄이고 재사용성을 높일 수 있다.

        static String extractNumber(String s)

    와 같은 형태로 구현하면 코드가 더 깔끔해진다.
*/