import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info students [] = new Info [n];
        for (int i = 0; i < n; i++) {
            students[i] = new Info(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students, (a, b) -> Integer.compare(a.sum, b.sum));
        for (int i = 0; i < n; i ++) {
            System.out.printf("%s %d %d %d\n", students[i].name, students[i].s1, students[i].s2, students[i].s3);
        }
    }
}

class Info {
    String name;
    int s1;
    int s2;
    int s3;
    int sum;
    public Info () {
        this.name = "";
        this.s1 = 0;
        this.s2 = 0;
        this.s3 = 0;
    }
    public Info (String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.sum = s1 + s2 + s3;
    }
}
/*
    각 학생의 세 과목 점수 합계를 Info 객체의 sum에 저장하고,
    sum을 기준으로 오름차순 정렬하는 방식으로 구현하였다.

    Integer.compare(a.sum, b.sum)을 사용했으므로
    총점이 낮은 학생부터 높은 학생 순으로 정렬된다.

    코드 리뷰(GPT):
    현재 구현은 적절하다.
    생성자에서 sum을 한 번 계산해 저장하므로 정렬할 때마다
    s1 + s2 + s3을 다시 계산할 필요가 없다.

    다만 기본 생성자 Info()는 현재 코드에서 사용하지 않으므로 제거해도 된다.

    또한 Info보다 Student처럼 객체의 의미가 명확한 클래스명을 사용하면
    코드의 가독성이 더 좋아진다.

    시간복잡도는 Arrays.sort()가 지배하므로 O(n log n)이다.
*/