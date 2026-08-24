import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person [] people = new Person[sc.nextInt()];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(people, (a, b) -> {
            if(a.h == b.h) return b.w - a.w;
            return a.h - b.h;
        });
        
        for (int i = 0; i < people.length; i++) {
            System.out.printf("%s %d %d\n", people[i].n, people[i].h, people[i].w);
        }
    }
}

class Person {
    String n;
    int h;
    int w;
    public Person (String n, int h, int w) {
        this.n = n;
        this.h = h;
        this.w = w;
    }
}

/*
    접근 방법:
    입력받은 사람의 이름, 키, 몸무게를 Person 객체로 만들어 배열에 저장하였다.

    Arrays.sort()와 Comparator를 이용하여 두 가지 조건으로 정렬하였다.

    1. 키(h)가 작은 사람이 앞에 오도록 오름차순 정렬
    2. 키가 같다면 몸무게(w)가 큰 사람이 앞에 오도록 내림차순 정렬

        Arrays.sort(people, (a, b) -> {
            if (a.h == b.h) return b.w - a.w;
            return a.h - b.h;
        });

    코드 리뷰(GPT):
    다중 조건 정렬을 올바르게 구현하였다.

    a.h - b.h
    → 키 오름차순

    b.w - a.w
    → 몸무게 내림차순

    따라서 키가 작은 순으로 정렬하되,
    키가 같을 때는 몸무게가 큰 사람이 먼저 배치된다.

    다만 Comparator에서 뺄셈을 사용하는 것보다
    Integer.compare()를 사용하는 것이 정수 overflow에 안전하다.

    다음과 같이 작성할 수 있다.

        Arrays.sort(people, (a, b) -> {
            if (a.h == b.h) {
                return Integer.compare(b.w, a.w);
            }
            return Integer.compare(a.h, b.h);
        });

    시간복잡도는 정렬에 O(N log N),
    Person 객체를 저장하기 위한 공간복잡도는 O(N)이다.
*/