import java.util.Scanner;

public class ToggleCase {
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String s_new = "";
        char temp = ' ';

        for (int x = 0; x < s.length(); x += 1) {
            temp = s.charAt(x);
            if (Character.isLowerCase(temp)) {
                temp = Character.toUpperCase(temp);
            } else {
                temp = Character.toLowerCase(temp);
            }
            s_new += temp;
        }

        System.out.println("New String: ".concat(s_new));
    }
}
