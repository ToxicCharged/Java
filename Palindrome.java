import java.util.Scanner;

public class Palindrome {
    public static void chief() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Number Palindrome");
        System.out.println("2) Letter Palindrome");
        System.out.print("Choose an option: ");
        int ch = sc.nextInt();
        System.out.println();

        if (ch == 1) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int temp;

            if (num > 0) {
                temp = num;
            } else {
                temp = num * -1;
            }

            int rev_num = 0;
            double x = -1;

            while (temp > 0) {
                temp /= 10;
                x += 1;
            }

            if (num > 0) {
                temp = num;
            } else {
                temp = num * -1;
            }

            while (temp > 0) {
                rev_num += (temp % 10) * Math.pow(10.0, x);
                temp /= 10;
                x -= 1;
            }

            rev_num *= num > 0 ? 1 : -1;

            if (rev_num == num) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " isn't a palindrome.");
            }

        } else if (ch == 2) {

            System.out.print("Enter a word: ");
            String word = sc.next();
            word = word.toLowerCase();
            String rev_word = "";
            int x = word.length() - 1;

            while (x >= 0) {
                rev_word = rev_word + word.charAt(x);
                x -= 1;
            }

            if (rev_word.equals(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }

        } else {
            System.out.println("Invalid.");
        }
    }
}
