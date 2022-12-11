import java.util.Scanner;

public class NumberOfWords {
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int c = 1;

        for (int x = 0; x < s.length(); x += 1) {
            if (Character.isWhitespace(s.charAt(x))) {
                c += 1;
            }
        }

        if (c == 1) {
            System.out.println("Assuming there to be exactly 1 space between each word, there is " + c + " word.");
        } else {
            System.out.println("Assuming there to be exactly 1 space between each word, there are " + c + " words.");
        }
    }
}
