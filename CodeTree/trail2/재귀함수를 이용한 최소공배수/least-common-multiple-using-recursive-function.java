import java.util.*;

public class Main {
    private static boolean isComplete = false;
    private static int multiple = 2;
    private static ArrayList <Integer> list = new ArrayList<Integer> ();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        Collections.sort(list);
        System.out.print(getLcm(list.get(list.size()-1)));
    }

    private static int getLcm(int lcm) {
        for(Integer i : list) {
            if(lcm % i != 0) {
                isComplete = false;
                break;
            } else {
                isComplete = true;
            }
        }
        if(!isComplete) return getLcm(list.get(list.size()-1) * multiple++);
        return lcm;
    }
}

/*
    접근 방법:
    입력받은 수들을 정렬하여 가장 큰 수를 기준값으로 잡고,
    그 수의 배수를 하나씩 증가시키면서 모든 수로 나누어 떨어지는지 확인하였다.

    모든 수로 나누어 떨어지면 해당 값이 최소공배수이므로 반환하고,
    그렇지 않으면 다음 배수를 만들어 재귀 호출한다.

    코드 리뷰(GPT):
    이전 코드와 달리 Collections.sort()를 사용했기 때문에
    list의 마지막 값이 실제 최댓값이라는 점이 보장된다.

    따라서 가장 큰 수의 배수만 검사하므로
    작은 수를 기준으로 시작하는 것보다 불필요한 재귀 호출을 줄일 수 있다.

    현재 제한 조건에서는 정답을 구하는 데 문제가 없다.

    다만 isComplete는 전역 변수로 둘 필요가 없다.
    후보값이 모든 수로 나누어 떨어지는지는 현재 재귀 호출 내부에서만 판단하면 된다.

    또한 multiple 역시 전역 상태라 재귀 흐름을 추적하기 어렵다.
    현재 검사할 후보값 자체를 매개변수로 넘기는 방식이 더 단순하다.

    현재 방식은 최소공배수 공식을 이용하는 방식이 아니라
    최댓값의 배수를 하나씩 검사하는 탐색 방식이다.
*/