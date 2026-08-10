import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.print(isPalindrome(sb) ? "Yes" : "No");
    }

    public static boolean isPalindrome(StringBuilder sb) {
        return sb.toString().equals(sb.reverse().toString());
    }
}

/*
    접근 방법:
    입력 문자열을 StringBuilder로 만든 뒤,
    원본 문자열과 reverse()한 문자열을 비교하여 팰린드롬 여부를 판단하였다.

    코드 리뷰(GPT):
    현재 코드는 정상적으로 동작한다.

    다만 reverse()는 StringBuilder 자체를 뒤집는 메서드이므로
    isPalindrome() 호출 이후 전달받은 StringBuilder의 내용도 뒤집힌 상태가 된다.

    현재 코드에서는 이후 sb를 다시 사용하지 않기 때문에 문제는 없다.

    원본을 유지하고 싶다면 새 StringBuilder를 만들어 뒤집는 방식이 안전하다.

    시간복잡도:
    O(n)

    공간복잡도:
    O(n)
*/