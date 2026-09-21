//  두 수 비교하기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        if(A>B) System.out.println(">");
        if(A<B) System.out.println("<");
        if(A==B) System.out.println("==");
    }
}