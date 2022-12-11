import java.util.Scanner;

public class Factorial
{
    public static void chief() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int factorial = 1, x;

        for (x = 1; x <= num; x += 1) {
            factorial = factorial * x;
        }

        System.out.println("Factorial = " + factorial);
    }
}
