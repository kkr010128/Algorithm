import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        while (true) {
            String tmp = sc.next();
            
            if (tmp.equals("0")) {
                break;
            }
            
            cnt++;    
            
            if (cnt % 2 == 1) {
                sb.append(tmp).append("\n");
            }
        }
        System.out.println(cnt);
        System.out.print(sb);
    }
}
/*
    입력이 '0'이 나올 때까지 문자열을 입력받으며,
    입력된 문자열의 개수를 cnt로 세고,
    홀수 번째(1, 3, 5, ...) 입력된 문자열만 StringBuilder에 저장하여
    마지막에 한 번에 출력하는 방식으로 구현하였다.

    코드 리뷰(GPT):

    전체 흐름은 깔끔하다.
    무한 반복 후 종료 조건을 먼저 검사하는 방식도 적절하다.

    다만 StringBuilder를 사용했음에도 마지막에

        System.out.println(cnt);
        System.out.print(sb);

    처럼 두 번 출력하고 있는데,
    출력 형식에 맞지 않는다면 cnt 출력은 제거해야 한다.

    또한 줄바꿈은

        sb.append(tmp).append('\n');

    처럼 문자('\n')를 사용하는 것이 문자열("\n")보다 조금 더 효율적이다.

    현재 시간복잡도는 O(n)이며,
    StringBuilder를 사용했기 때문에 문자열을 += 로 이어붙이는 것보다 효율적으로 구현하였다.
*/