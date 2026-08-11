import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        calculate(a, b);

        System.out.printf("%d %d", a.value, b.value);
    }

    public static void calculate(IntWrapper a, IntWrapper b) {
        if (a.value < b.value) {
            a.value += 10;
            b.value *= 2;
        } else {
            b.value += 10;
            a.value *= 2;
        }
    }
}

/*
    Java의 기본형(int)은 값이 복사되어 전달되므로
    함수 내부에서 값을 변경해도 main()의 원본 변수에는 반영되지 않는다.

    따라서 IntWrapper 객체에 값을 담아 함수에 전달하고,
    객체 내부의 value 필드를 직접 수정하는 방식으로 구현하였다.

    코드 리뷰(GPT):
    현재 코드는 문제 조건에 맞게 잘 구현되었다.

    calculate()에 a, b를 인자로 전달하고,
    함수 내부에서 a.value, b.value를 수정하므로
    호출 이후 main()에서도 변경된 값을 그대로 사용할 수 있다.

    if (a.value < b.value) {
        a.value += 10;
        b.value *= 2;
    } else {
        b.value += 10;
        a.value *= 2;
    }

    문제의 조건과 연산 순서도 정확하다.

    Java에서 객체를 전달할 때도 엄밀히는 참조값 자체가 값으로 복사되지만,
    두 참조가 같은 객체를 가리키므로 객체의 필드 변경은 원본에 반영된다.

    시간복잡도는 O(1), 공간복잡도는 O(1)이다.
*/