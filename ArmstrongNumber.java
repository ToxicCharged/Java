import java.util.Scanner;

public class ArmstrongNumber {
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        double x = 0;

        while (temp > 0) {
            temp /= 10;
            x += 1;
        }

        temp = num;

        while (temp > 0) {
            sum += Math.pow(temp % 10, x);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an armstrong number.");
        } else {
            System.out.println(num + " is not an armstrong number.");
        }

    }
}
