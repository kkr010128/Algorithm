import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        String[] word = sentence.split(" ");
        if (word[0].isEmpty())
            System.out.println(0);
        else
            System.out.println(word.length);
    }
}