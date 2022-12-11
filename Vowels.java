import java.util.Scanner;

public class Vowels {
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int x = 0, c = 0;
        String tempWord = "";
        char tempChar = s.charAt(x);
        System.out.print("Words with vowels are: ");

        while (x < s.length()) {
            while (tempChar != ' ' && x < s.length()) {
                tempWord += tempChar;
                x += 1;

                if (x < s.length()) {
                    tempChar = s.charAt(x);
                }
            }

            for (int i = 0; i < tempWord.length(); i += 1) {
                if (tempWord.charAt(i) == 'a' || tempWord.charAt(i) == 'e' || tempWord.charAt(i) == 'i' || tempWord.charAt(i) == 'o' || tempWord.charAt(i) == 'u') {
                    c += 1;
                }
            }

            if (c > 0) {
                System.out.print(tempWord + " ");
            }

            tempWord = "";
            c = 0;
            x += 1;
            if (x < s.length()) {
                tempChar = s.charAt(x);
            }
        }
    }
}
