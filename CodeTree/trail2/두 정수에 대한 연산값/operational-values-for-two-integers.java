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
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }
}
/*
    접근 방법:
    int 값을 직접 함수에 전달하면 Call By Value로 값이 복사되기 때문에
    함수 내부에서 수정해도 main의 원본 값은 바뀌지 않는다.

    이를 해결하기 위해 int 값을 IntWrapper 객체 내부의 value에 저장하고,
    IntWrapper 객체를 calculate()의 인자로 전달하였다.

    calculate()에서는 a.value와 b.value를 직접 수정하므로
    main과 calculate()가 같은 객체를 바라보는 상태에서 실제 객체 내부 값이 변경된다.

    코드 리뷰(GPT):
    현재 방식이 문제 의도에 잘 맞는다.

    Java는 reference type도 Call By Value이지만,
    객체를 넘길 때는 객체를 가리키는 참조값이 복사된다.
    따라서 calculate()의 a, b와 main의 a, b는 각각 별도 변수이지만
    같은 IntWrapper 객체를 바라보게 된다.

    그래서 a.value += 25, b.value *= 2처럼
    객체 내부 상태를 변경하면 main에서도 변경된 값을 확인할 수 있다.

    조건문도 큰 값에는 25를 더하고 작은 값에는 2를 곱하도록 정확히 구현되어 있다.

    시간복잡도:
    O(1)

    공간복잡도:
    O(1)
*/