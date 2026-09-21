public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7, tmp, tmpp;
        tmp = b;
        tmpp = c;
        b = a;
        c = tmp;
        a = tmpp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}