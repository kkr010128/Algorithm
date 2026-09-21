import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] word1 = sc.next().toCharArray();
        char [] word2 = sc.next().toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);
        
        System.out.print(Arrays.equals(word1, word2) ? "Yes" : "No");
    }
}