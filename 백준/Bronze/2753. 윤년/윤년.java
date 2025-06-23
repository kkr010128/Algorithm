//  윤년

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) System.out.println(1);
        else System.out.println(0);
    }
}