import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] b = new int [n];
        String result = "No";

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < n; i++) {
            if (a[i] != b[i]) break;
            if (i == n-1) result = "Yes";
        }
        System.out.print(result);
    }
}

/*
    두 수열이 순서에 관계없이 같은 원소로 이루어져 있는지 확인하기 위해
    각각 오름차순으로 정렬한 뒤 같은 위치의 원소를 비교하였다.

    정렬 후 하나라도 다른 원소가 있다면 서로 다른 수열이므로 "No"를 출력하고,
    마지막 원소까지 모두 같다면 "Yes"를 출력하도록 구현하였다.

    코드 리뷰(GPT):
    현재 접근은 적절하며 정답이다.

    두 배열을 정렬하면 원래 원소의 순서와 관계없이
    동일한 원소를 가지고 있는지 같은 인덱스끼리 비교할 수 있다.

    현재 코드는 마지막 인덱스까지 도달했을 때 result를 "Yes"로 변경하는데,
    처음부터 "Yes"로 두고 다른 원소를 발견했을 때 "No"로 변경하는 방식이
    조건을 조금 더 단순하게 표현할 수 있다.

    또한 Java에서는 Arrays.equals(a, b)를 사용하면
    정렬된 두 배열이 같은지 직접 비교할 수도 있다.

    시간복잡도는 두 배열의 정렬이 지배하므로 O(n log n)이다.
    비교 과정은 O(n)이다.
*/