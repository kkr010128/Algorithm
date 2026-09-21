//  나머지

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();
        System.out.println(firstInput * (secondInput % 10));
        System.out.println(firstInput * ((secondInput / 10) % 10));
        System.out.println(firstInput * (secondInput / 100));
        System.out.println(firstInput * secondInput);
    }
}