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