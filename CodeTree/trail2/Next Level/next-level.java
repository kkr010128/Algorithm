import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NextLevel nl1 = new NextLevel();
        NextLevel nl2 = new NextLevel(sc.next(), sc.nextInt());
        formatter(nl1); 
        formatter(nl2); 
    }
    private static void formatter(NextLevel nl) {
        System.out.printf("user %s lv %d\n", nl.id, nl.lv);
    }
}

class NextLevel {
    String id;
    int lv;
 
    public NextLevel() {
        this.id = "codetree";
        this.lv = 10;
    }

    public NextLevel(String id, int lv) {
        this.id = id;
        this.lv = lv;
    }
}

/*
    접근 방법:
    아이디와 레벨을 하나의 객체로 관리하기 위해 NextLevel 클래스를 정의하였다.

    기본값이 필요한 첫 번째 객체는 기본 생성자를 사용하여
    id를 "codetree", lv를 10으로 초기화하였다.

    두 번째 객체는 매개변수가 있는 생성자를 사용하여
    입력받은 아이디와 레벨로 초기화하였다.

    두 객체의 출력 형식이 동일하므로 formatter() 메서드에서
    객체를 전달받아 한 번에 출력하도록 구현하였다.

    코드 리뷰(GPT):
    생성자 오버로딩을 적절하게 사용한 코드이다.

    NextLevel()과 NextLevel(String id, int lv)는
    매개변수의 차이로 서로 다른 생성자로 구분된다.

    NextLevel nl1 = new NextLevel();
    → 기본 생성자 호출
    → codetree, 10

    NextLevel nl2 = new NextLevel(sc.next(), sc.nextInt());
    → 매개변수가 있는 생성자 호출
    → 입력값으로 초기화

    formatter()는 객체를 생성하거나 수정할 필요 없이
    출력만 담당하므로 static 메서드로 작성해 main()에서
    객체 생성 없이 직접 호출한 것도 문제없다.

    현재 코드는 문제의 요구사항에 맞으며 논리적인 오류가 없다.
*/