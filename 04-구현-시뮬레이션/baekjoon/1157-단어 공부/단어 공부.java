import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
        sc.close();
    }
}