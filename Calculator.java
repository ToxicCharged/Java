import java.util.Scanner;

public class Calculator {
    public static void chief() {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is a calculator.");
        System.out.println("");

        System.out.println("Your options are:");
        System.out.println("+ -> Addition");
        System.out.println("- -> Subtraction");
        System.out.println("* -> Multiplication");
        System.out.println("/ -> Division");
        System.out.println("^ -> Exponent");
        System.out.println("= -> Equals");
        System.out.println();

        System.out.print("Enter number: ");
        double x = sc.nextDouble();
        double answer = x;

        while (true) {
            System.out.print("Enter operator: ");
            char ch = sc.next().charAt(0);

            if (ch == '=') {
                break;
            }

            if (! (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')) {
                System.out.println("Invalid operator.");
                continue;
            }

            System.out.print("Enter number: ");
            double y = sc.nextDouble();

            switch (ch) {
                case '+':
                    answer += y;
                    break;
                case '-':
                    answer -= y;
                    break;
                case '*':
                    answer *= y;
                    break;
                case '/':
                    answer /= y;
                    break;
                case '^':
                    answer = Math.pow(answer, y);
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
        }

        System.out.println("Answer: " + answer);

    }
}
