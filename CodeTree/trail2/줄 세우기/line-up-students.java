import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Inbody [] students = new Inbody [n];
        
        for (int i = 0; i < n; i++) {
            students[i] = new Inbody(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(students, (a, b) ->  {
            if(a.h == b.h) {
                if(a.w == b.w) {
                    return a.i - b.i;
                }
                return b.w - a.w;
            }
            return b.h - a.h;
        });

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", students[i].h, students[i].w, students[i].i);
        }        
    }
}

class Inbody {
    int h;
    int w;
    int i;
    public Inbody(int h, int w, int i) {
        this.h = h;
        this.w = w;
        this.i = i;
    }
}

/*
    접근 방법:
    학생 정보를 객체로 저장하고 Arrays.sort()의 Comparator를 이용해 다중 조건 정렬을 수행하였다.

    정렬 기준은 다음과 같다.
    1. 키(h)가 큰 학생이 앞에 온다.
    2. 키가 같으면 몸무게(w)가 큰 학생이 앞에 온다.
    3. 키와 몸무게가 모두 같으면 입력 순서인 번호(i)가 작은 학생이 앞에 온다.

    입력될 때 i + 1을 번호로 저장했기 때문에 별도의 번호 입력은 필요하지 않다.

    코드 리뷰(GPT):
    문제의 정렬 조건을 그대로 Comparator에 구현한 적절한 풀이이다.
    학생 N명을 정렬하므로 시간복잡도는 O(N log N),
    학생 정보를 저장하는 데 O(N)의 공간이 필요하다.

    현재 코드의
        return a.i - b.i;
        return b.w - a.w;
        return b.h - a.h;
    방식도 문제의 값 범위가 충분히 작다면 정상적으로 동작한다.

    다만 일반적으로 정수 뺄셈을 Comparator의 반환값으로 사용하는 경우
    값의 범위가 매우 크면 overflow 가능성이 있으므로
    Integer.compare()를 사용하는 방식이 더 안전하다.

    예:
        if (a.h != b.h) {
            return Integer.compare(b.h, a.h);
        }
        if (a.w != b.w) {
            return Integer.compare(b.w, a.w);
        }
        return Integer.compare(a.i, b.i);

    또한 Inbody의 필드 i는 학생 번호를 의미하므로
    index보다 number 같은 이름을 사용하면 의미가 더 명확하다.
*/