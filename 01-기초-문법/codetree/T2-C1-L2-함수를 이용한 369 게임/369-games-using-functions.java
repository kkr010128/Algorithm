import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int a = sc.nextInt(), b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            if(isClap(i)) cnt++;
        }
        System.out.print(cnt);
    }

    public static boolean isClap(int i) {
        return isTSN(i) || isMultiple(i);
    }

    public static boolean isTSN(int i) {
        String s = i + "";
        for(int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
               return true;
            }
        }
        return false;
    }

    public static boolean isMultiple(int i) {
        return (i % 3 == 0);
    }
}

/*
    a부터 b까지의 수를 하나씩 확인하면서,
    숫자에 3, 6, 9가 포함되어 있거나 3의 배수이면
    박수를 치는 수로 판단하여 개수를 증가시키는 방식이다.

    코드 리뷰(GPT):
    현재 코드는 정상적으로 동작하며 구조도 깔끔하다.

    isClap()은 두 조건을 OR 연산으로 바로 반환하고,
    isTSN()은 문자열의 각 자리를 검사하여
    3, 6, 9 중 하나라도 발견하면 즉시 true를 반환한다.

    isMultiple()도
    return (i % 3 == 0);
    형태로 불필요한 삼항 연산자를 제거해서 적절하다.

    괄호는 없어도 동일하게 동작하므로
    return i % 3 == 0;
    으로 작성해도 된다.

    시간복잡도는 O((b - a + 1) * d)이며,
    d는 각 숫자의 자릿수이다.

    현재 수준에서는 추가로 수정할 부분은 거의 없다.
*/