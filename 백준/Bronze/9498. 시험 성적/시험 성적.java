//  두 수 비교하기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long grade = sc.nextInt();
        if(grade>=90) System.out.println("A");
        else if(grade>=80) System.out.println("B");
        else if(grade>=70) System.out.println("C");
        else if(grade>=60) System.out.println("D");
        else System.out.println("F");
    }
}
