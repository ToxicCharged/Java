import java.util.Scanner;
public class ReverseNumber {
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp;

        if (num > 0) {
            temp = num;
        } else {
            temp = num * -1;
        }

        int rev_num = 0;
        double x = -1, buffer = 0;

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
            buffer += temp % 10;
            temp /= 10;
            rev_num += buffer * Math.pow(10.0, x);
            buffer = 0;
            x -= 1;
        }

        rev_num = num > 0 ? rev_num : rev_num * -1;
        System.out.println("It's reverse is: " + rev_num);

    }
}
