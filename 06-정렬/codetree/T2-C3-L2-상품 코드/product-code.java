import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product pd1 = new Product();
        System.out.printf("product %d is %s\n", pd1.code, pd1.name);
        Product pd2 = new Product(sc.next(), sc.nextInt());
        System.out.printf("product %d is %s", pd2.code, pd2.name);
    }
}

class Product {
    String name;
    int code;
    
    public Product() {
        this.name = "codetree";
        this.code = 50;
    }
    
    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}