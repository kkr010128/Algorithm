import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();

        System.out.print(text.indexOf(pattern));
    }
}

/*
    indexOf()를 사용하면 문자열 내에서 목적 문자열이 처음 등장하는 위치를
    바로 구할 수 있다고 판단하여 해당 메서드를 사용하였다.

    코드 리뷰(GPT):
    indexOf()는 문자열이 존재하지 않으면 -1을, 존재하면 가장 먼저 등장하는
    인덱스를 반환하므로 문제의 요구사항과 정확히 일치한다.

    또한 문자열을 한 번만 탐색하므로 시간복잡도는 O(N)이며,
    별도의 예외 처리가 필요하지 않은 가장 적절한 풀이이다.
*/