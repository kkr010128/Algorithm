import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c < 97) System.out.printf("%c", c+32);
            else System.out.printf("%c", c-32);
        }
    }
}
/*
    입력받은 문자열을 순회하면서
    대문자는 소문자로, 소문자는 대문자로 변환하여 출력하였다.

    ASCII 코드에서 대문자와 소문자의 차이가 32임을 이용하여
    문자 코드에 ±32를 더하거나 빼는 방식으로 구현하였다.

    코드 리뷰(GPT):

    현재 접근이 적절하다.
    문자열을 한 번만 순회하므로 시간복잡도는 O(N)이다.

    다만 StringBuilder를 생성했지만 내용을 수정하지 않고
    단순 조회만 수행하므로 StringBuilder를 사용할 필요는 없다.
    String으로 받아 charAt()을 사용하는 편이 더 자연스럽다.

    또한

        if (c < 97)

    처럼 ASCII 코드값을 직접 사용하는 것보다

        if ('A' <= c && c <= 'Z')

    또는

        if (Character.isUpperCase(c))

    처럼 의도가 드러나는 조건을 사용하는 것이 가독성이 좋다.

    마지막으로 반복문 안에서 printf()는 불필요한 오버헤드가 있다.

        System.out.print((char)(c + 32));

    처럼 print()를 사용하거나,
    StringBuilder에 변환한 문자를 추가한 뒤 한 번에 출력하는 방식이
    일반적으로 더 효율적이다.
*/