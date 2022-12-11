import java.util.Scanner;

public class StringFunctions {
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        for (int x = 0; x < s.length(); x += 1) {
            System.out.print(s.substring(x) + s.substring(0, x));
            System.out.println();
        }
    }
}
