import java.util.Scanner;
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int [] arr = new int [2];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        signString(line);
        System.out.print(isDuplicate() ? "Yes" : "No");
    }

    public static void signString(String line) {
        for (int i = 0; i < line.length(); i++) {
            sb.append(line.charAt(i));
        }
    }

    public static boolean isDuplicate() {
        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(arr[0] != sb.charAt(i) && arr[1] != sb.charAt(i)) {
                arr[idx] = (int)sb.charAt(i);
                cnt++;
                if (cnt == 2) return true;
                idx++;
            }
            continue;
        }
        return false;
    }
}

/*
    문자열을 순회하면서 서로 다른 알파벳의 수가
    2개 이상인지 확인하는 문제이다.

    이전 코드의 접근 방향은 맞다.
    서로 다른 문자를 2개 찾는 순간 바로 true를 반환하면 된다.

    코드 리뷰(GPT):
    이 문제에서는 모든 알파벳을 저장할 필요가 없다.
    첫 번째 문자와 다른 문자가 하나라도 존재하면
    서로 다른 알파벳이 2개 이상이라는 뜻이다.

    따라서 다음처럼 더 단순하게 구현할 수 있다.

    public static boolean hasTwoDifferentChars(String str) {
        char first = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != first) {
                return true;
            }
        }
        return false;
    }

    전체 코드:

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            System.out.print(hasTwoDifferentChars(str) ? "Yes" : "No");
        }

        public static boolean hasTwoDifferentChars(String str) {
            char first = str.charAt(0);

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != first) {
                    return true;
                }
            }
            return false;
        }
    }

    예를 들어
    "aaaa" → 모두 첫 문자와 같음 → No
    "aaab" → b가 첫 문자 a와 다름 → Yes

    시간복잡도는 O(n), 공간복잡도는 O(1)이다.
*/