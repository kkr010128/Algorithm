import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person [] people = new Person [5];
        

        for (int i = 0; i < 5; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        
        Arrays.sort(people, (a, b) -> a.name.compareTo(b.name));
        
        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", people[i].name, people[i].height, people[i].weight);
        }
        
        Arrays.sort(people, (a, b) -> Integer.compare(b.height, a.height));
        
        System.out.println("\nheight");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", people[i].name, people[i].height, people[i].weight);
        }
    }
}

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
/*
    접근 방법:
    5명의 이름, 키, 몸무게를 Person 객체로 만들어 배열에 저장하였다.

    이름순 출력에서는 String의 compareTo()를 이용해
    이름을 사전순(오름차순)으로 정렬하였다.

        Arrays.sort(people, (a, b) -> a.name.compareTo(b.name));

    이후 같은 배열을 다시 정렬하여
    Integer.compare()를 이용해 키가 큰 순(내림차순)으로 정렬하였다.

        Arrays.sort(people, (a, b) -> Integer.compare(b.height, a.height));

    코드 리뷰(GPT):
    문제에서 요구하는 두 가지 정렬 기준을 각각 Comparator로 구현한 적절한 풀이이다.

    문자열 정렬:
        a.name.compareTo(b.name)
        → 사전순 오름차순

    정수 정렬:
        Integer.compare(b.height, a.height)
        → 키 기준 내림차순

    같은 이름과 같은 키가 주어지지 않는다는 조건이 있으므로
    추가적인 정렬 조건을 처리할 필요가 없다.

    정렬을 두 번 수행하므로 일반적인 N명 기준 시간복잡도는 O(N log N)이며,
    이 문제에서는 항상 5명만 입력되므로 실제 처리량은 매우 작다.

    현재 구현에서 수정할 부분은 없다.
*/