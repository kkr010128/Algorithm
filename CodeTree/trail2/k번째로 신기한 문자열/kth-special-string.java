import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String t = sc.next();

        ArrayList <String> list = new ArrayList <>();
        
        for(int i = 0; i < n; i++) {
            String word = sc.next();
            if(word.startsWith(t)) list.add(word);
        }
        Collections.sort(list);
        System.out.print(list.get(k-1));
    }
}
/*
    문자열 T로 시작하는 단어만 ArrayList에 저장한 뒤,
    Collections.sort()를 이용해 사전순으로 정렬하고
    K번째 문자열을 출력하는 방식으로 구현하였다.

    코드 리뷰(GPT):
    현재 풀이가 적절하다.

    startsWith(t)를 사용해 필요한 문자열만 먼저 필터링하므로
    불필요한 문자열을 정렬 대상에서 제외할 수 있다.

    Collections.sort()는 String을 사전순으로 정렬하며,
    문제의 K는 1부터 시작하고 ArrayList의 인덱스는 0부터 시작하므로
    list.get(k - 1)도 정확하다.

    시간복잡도:
    문자열 필터링 O(N), 정렬 O(M log M)
    (M은 T로 시작하는 문자열의 개수)
*/