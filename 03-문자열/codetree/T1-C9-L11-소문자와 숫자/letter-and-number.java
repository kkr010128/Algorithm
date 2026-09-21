import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next().toLowerCase();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                System.out.print(c);
            }
        }

    }
}

/*
    입력받은 문자열을 모두 소문자로 변환한 뒤,
    영문자와 숫자만 출력하도록 구현하였다.

    Character.isLetter()와 Character.isDigit()를 사용하여
    ASCII 코드 범위를 직접 비교하지 않고 문자 종류를 판별하였다.

    코드 리뷰(GPT):

    현재 방식이 적절하다.
    문자열을 한 번만 순회하므로 시간복잡도는 O(N)이다.

    toLowerCase()를 먼저 호출했기 때문에
    반복문 안에서 대소문자를 따로 처리할 필요가 없어 코드가 간결하다.

    또한 Character 클래스의 메서드를 사용하여
    직접 'a' <= c && c <= 'z'와 같은 범위 비교를 작성하지 않아도 되므로
    가독성과 유지보수성이 좋다.

    다만 문제에서 ASCII 영문자(a~z, A~Z)와 숫자만을 대상으로 한다면
    Character.isLetter()는 한글, 일본어, 그리스 문자 등
    모든 유니코드 문자를 문자로 판단한다는 점을 알아둘 필요가 있다.

    따라서 ASCII 문자만 허용하는 문제라면

        ('a' <= c && c <= 'z') || Character.isDigit(c)

    처럼 범위를 직접 비교하는 것이 더 정확하다.
*/