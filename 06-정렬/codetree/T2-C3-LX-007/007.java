import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mission ms = new Mission(sc.next(), sc.next().charAt(0), sc.nextInt());
        System.out.printf("secret code : %s\nmeeting point : %c\ntime : %d", ms.code, ms.location, ms.time);
    }
}

class Mission {
    String code;
    char location;
    int time;

    public Mission(String c, char l, int t) {
        this.code = c;
        this.location = l;
        this.time = t;
    }
}
/*
    Mission 클래스를 정의하고
    비밀 코드, 접선 장소, 시간을 각각 필드로 저장하였다.

    생성자를 통해 입력받은 값을 객체 생성과 동시에 초기화하고,
    생성된 객체의 필드에 접근하여 지정된 형식으로 출력하였다.

    코드 리뷰(GPT):
    클래스와 생성자를 사용하는 목적에 맞게 잘 구현하였다.

    sc.next().charAt(0)을 사용하여 문자열로 입력되는 장소를
    char 타입으로 변환한 부분도 적절하다.

    생성자에서 매개변수명을 c, l, t로 작성해도 동작에는 문제가 없지만,
    code, location, time처럼 필드와 동일한 의미의 이름을 사용하면
    각 값의 의미가 더 명확해진다.

    예:
    public Mission(String code, char location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }

    현재 코드의 논리 및 문법상 문제는 없다.
*/