import java.util.Scanner;

public class SumOfDigits {
    public static void chief() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        int sum = 0, tSum = 0;

        for (double x = Math.pow(10, length - 1); x >= 1; x /= 10) {
            sum += num/x;
            num -= sum * x;
            tSum += sum;
            sum = 0;
        }

        System.out.println("Sum of the digits = " + tSum);
    }
}
