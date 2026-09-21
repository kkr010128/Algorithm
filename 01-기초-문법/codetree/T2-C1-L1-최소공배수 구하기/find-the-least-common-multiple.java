import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = getGCD(a, b);
        printLCM(gcd, a, b);
    }
    
    public static void printLCM(int gcd, int a, int b) {
        int lcm = (a * b)/gcd;
        System.out.println(lcm);
    }


    public static int getGCD(int a, int b) {
        int gcd = 1;
        int max = a > b ? b : a;
        
        for (int cnt = max; cnt > 0; cnt--) {
            if (a % cnt == 0 && b % cnt == 0) {
                gcd = cnt;
                break;
            }
        }
        return gcd;
    }
}

/*
    두 수 중 작은 값부터 1까지 감소시키면서,
    두 수를 모두 나누어떨어지게 하는 첫 번째 값을 최대공약수(GCD)로 찾는 방식이다.

    이후 최소공배수(LCM)는
    (a * b) / gcd
    공식을 이용해 계산하였다.

    코드 리뷰(GPT):
    현재 구현은 정답을 구하는 데 문제없다.

    getGCD()에서 작은 수부터 역순으로 탐색하므로
    첫 번째 공약수가 곧 최대공약수라는 점을 잘 활용했다.

    다만 변수명 max는 실제로는 두 수 중 작은 값을 저장하므로
    min 또는 limit 같은 이름이 더 적절하다.

    또한 현재 GCD 탐색은 최악의 경우 O(min(a, b))이므로,
    입력 범위가 커지면 유클리드 호제법을 사용하는 것이 더 효율적이다.

    최소공배수 계산에서 (a * b)가 int 범위를 초과할 가능성이 있다면
    (a / gcd) * b 형태로 계산하거나 long을 사용하는 것이 안전하다.
*/