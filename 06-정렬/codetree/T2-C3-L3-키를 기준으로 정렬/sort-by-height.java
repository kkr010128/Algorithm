import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person [] people = new Person [n];

        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            people[i] = new Person(name[i], height[i], weight[i]);
        }
        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.t, p2.t));

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d %d\n", people[i].n, people[i].t, people[i].w);
        }
    }
}

class Person {
    String n;
    int t;
    int w;
    public Person(String n, int t, int w) {
        this.n = n;
        this.t = t;
        this.w = w;
    }
}