import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Person [] people = new Person[num];
        ArrayList <String> names = new ArrayList<>();

        for(int i = 0; i < num; i++) {
            String name = sc.next();
            people[i] = new Person(name, sc.next(), sc.next());
        }
        Arrays.sort(people, Comparator.comparing(p -> p.n));
        System.out.printf("name %s\naddr %s\ncity %s", people[num-1].n, people[num-1].a, people[num-1].c);
    }
}

class Person {
    String n, a, c;
    public Person(String n, String a, String c) {
        this.n = n;
        this.a = a;
        this.c = c;
    }
}
/*
    접근 방법:
    Person 클래스를 정의하여 이름, 주소, 도시 정보를 하나의 객체로 관리하였다.

    입력받은 Person 객체들을 배열에 저장한 뒤,
    Comparator.comparing()을 사용하여 Person의 n 필드를 기준으로
    이름을 사전순으로 정렬하였다.

    정렬 후 배열의 마지막 객체를 선택하여
    사전순으로 가장 뒤에 오는 사람의 정보를 출력하였다.

    코드 리뷰(GPT):
    Person 객체 자체를 이름 기준으로 정렬했기 때문에
    이름뿐만 아니라 해당 이름에 연결된 주소와 도시 정보도 함께 유지된다.

    p -> p.n은 Person 객체 p에서 n을 정렬 기준으로 사용한다는 의미이다.

    Arrays.sort()는 기본적으로 오름차순으로 정렬하므로
    people[num - 1]은 이름이 사전순으로 가장 뒤에 있는 Person이다.

    현재 코드에서 ArrayList<String> names는 생성만 하고 사용하지 않으므로
    제거하는 것이 좋다.

    그 외에는 간결하고 적절한 풀이이다.

    시간복잡도:
    정렬 O(N log N)
*/