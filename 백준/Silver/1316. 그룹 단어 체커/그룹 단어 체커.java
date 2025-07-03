import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] seen = new boolean[26];
            boolean isGroupWord = true;
            char prevChar = word.charAt(0);
            seen[prevChar - 'a'] = true;

            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if (currentChar != prevChar) {
                    if (seen[currentChar - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    seen[currentChar - 'a'] = true;
                }
                prevChar = currentChar;
            }

            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}