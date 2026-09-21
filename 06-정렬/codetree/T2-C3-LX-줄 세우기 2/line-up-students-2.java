import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person [] people = new Person [n];

        for (int i = 0; i < n; i++) people[i] = new Person(sc.nextInt(), sc.nextInt(), i+1);
        
        Arrays.sort(people, (a, b) -> {
            if(a.h == b.h) return Integer.compare(b.w, a.w);
            return Integer.compare(a.h, b.h);
        });

        for(int i = 0; i < n; i++) System.out.printf("%d %d %d\n", people[i].h, people[i].w, people[i].idx);
    }
}

class Person {
    int h, w, idx;
    public Person(int h, int w, int idx) {
        this.h = h;
        this.w = w;
        this.idx = idx;
    }
}