import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        for(int i = 0; i < sb1.length(); i++) {
            if(Character.isLetter(sb1.charAt(i))) {
                sb1.deleteCharAt(i);
                i--;
            }
        }
        for(int i = 0; i < sb2.length(); i++) {
            if(Character.isLetter(sb2.charAt(i))) {
                sb2.deleteCharAt(i);
                i--;
            }
        }
        System.out.printf("%d", Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()));
    }
}
/*
    입력받은 두 문자열에서 영문자를 제거하여 숫자만 남긴 뒤,
    이를 정수로 변환하여 합을 출력하는 방식으로 구현하였다.

    StringBuilder를 이용해 문자열을 직접 수정하는 방법으로 접근하였다.

    코드 리뷰(GPT):

    처음에는 deleteCharAt()으로 문자를 삭제하면서
    반복문의 인덱스를 그대로 증가시켜 삭제된 뒤 앞으로 당겨진 문자를
    검사하지 못하는 실수가 있었다.

        sb1.deleteCharAt(i);

    StringBuilder에서 문자를 삭제하면 뒤의 문자들이 한 칸씩 앞으로 이동한다.
    따라서 삭제 직후에는 같은 인덱스를 다시 검사해야 하므로

        i--;

    를 추가한 현재 구현이 올바른 방식이다.

    또한 StringBuilder를 직접 수정하는 방법을 사용했기 때문에
    별도의 문자열을 생성하지 않아 구현이 직관적이다.

    다만 deleteCharAt()은 삭제할 때마다 뒤의 문자들을 한 칸씩 이동시키므로
    한 번의 삭제가 O(N)의 시간이 걸린다.

    따라서 문자가 많이 삭제되는 경우 전체 시간복잡도는 최악의 경우 O(N²)이 된다.

    이 문제에서는 새로운 StringBuilder를 만들어 숫자만 append()하는 방식이
    시간복잡도 O(N)으로 더 효율적이다.
*/