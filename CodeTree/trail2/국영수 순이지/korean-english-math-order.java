import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student(
                sc.next(),
                sc.nextInt(),
                sc.nextInt(),
                sc.nextInt()
            );
        }

        Arrays.sort(students, (a, b) -> {
            if (a.k != b.k) {
                return Integer.compare(b.k, a.k);
            }
            if (a.e != b.e) {
                return Integer.compare(b.e, a.e);
            }
            return Integer.compare(b.m, a.m);
        });

        for (Student student : students) {
            System.out.printf(
                "%s %d %d %d\n",
                student.name,
                student.k,
                student.e,
                student.m
            );
        }
    }
}

class Student {
    String name;
    int k;
    int e;
    int m;

    public Student(String name, int k, int e, int m) {
        this.name = name;
        this.k = k;
        this.e = e;
        this.m = m;
    }
}