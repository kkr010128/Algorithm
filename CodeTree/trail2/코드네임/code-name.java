import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cmp = 0;
        Agent [] agents = new Agent[5];
        Agent worstAgent = new Agent();

        for(int i = 0; i < 5; i++) {
            agents[i] = new Agent(sc.next().charAt(0), sc.nextInt());
            if(cmp == 0) cmp = agents[i].s;
            if(agents[i].s <= cmp) {
                cmp = agents[i].s;
                worstAgent.n = agents[i].n;
                worstAgent.s = agents[i].s;
            }
        }
        System.out.printf("%c %d", worstAgent.n, worstAgent.s);
    }
}

class Agent {
    char n;
    int s;
    public Agent() {
        this.n = 'a';
        this.s = 0;
    }
    public Agent(char n, int s) {
        this.n = n;
        this.s = s;
    }
}
/*
    접근 방법:
    Agent 클래스를 이용해 코드네임과 점수를 하나의 객체로 관리하고,
    5명의 요원을 Agent 배열에 저장하였다.

    첫 번째로 입력받은 점수를 cmp의 초기값으로 설정한 뒤,
    이후 입력되는 Agent의 점수가 현재 cmp보다 작거나 같으면
    cmp와 worstAgent의 정보를 갱신하였다.

    코드 리뷰(GPT):
    현재 코드는 모든 입력 순서에서 가장 낮은 점수의 Agent를 정확히 찾는다.

    다만 worstAgent의 필드를 하나씩 복사할 필요는 없다.

    현재:
    worstAgent.n = agents[i].n;
    worstAgent.s = agents[i].s;

    다음처럼 객체 참조 자체를 저장할 수 있다.

    worstAgent = agents[i];

    또한 점수는 모두 서로 다르다고 문제에서 보장하므로
    <= 대신 < 를 사용해도 된다.

    cmp를 0으로 두고 첫 입력에서 초기화하는 방식도 동작하지만,
    첫 번째 Agent를 먼저 입력받아 기준으로 잡으면
    별도의 cmp == 0 조건 없이 더 단순하게 작성할 수 있다.

    현재 구현은 정답이며 시간복잡도는 O(5), 일반화하면 O(n)이다.
*/