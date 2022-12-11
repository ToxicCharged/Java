import java.util.Scanner;

public class MasterClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1) Calculator");
            System.out.println("2) Armstrong Number");
            System.out.println("3) Vowels");
            System.out.println("4) Palindrome");
            System.out.println("5) Reverse of Number");
            System.out.println("6) Sum of Digits");
            System.out.println("7) Circle");
            System.out.println("8) Rectangle");
            System.out.println("9) Factorial");
            System.out.println("10) LCM and HCF");
            System.out.println("11) Toggle Case");
            System.out.println("12) Number of Words");
            System.out.println("13) String Functions");
            System.out.println("0) Exit");
            System.out.println();
            System.out.print("Make a choice: ");
            int ch1 = sc.nextInt();
            System.out.println();

            if (ch1 == 0) {
                System.out.println("Have a good day!");
                break;
            }

            switch (ch1) {
                case 1 -> Calculator.chief();
                case 2 -> ArmstrongNumber.chief();
                case 3 -> Vowels.chief();
                case 4 -> Palindrome.chief();
                case 5 -> ReverseNumber.chief();
                case 6 -> SumOfDigits.chief();
                case 7 -> Circle.chief();
                case 8 -> Rectangle.chief();
                case 9 -> Factorial.chief();
                case 10 -> LCMandHCF.chief();
                case 11 -> ToggleCase.chief();
                case 12 -> NumberOfWords.chief();
                case 13 -> StringFunctions.chief();
                default -> System.out.println("Invalid.");
            }
            System.out.println();
            System.out.print("Would you like to continue? (y/n): ");
            char ch2 = sc.next().charAt(0);
            ch2 = Character.toLowerCase(ch2);

            if (ch2 == 'y') {
            } else if (ch2 == 'n') {
                System.out.println("Have a good day!");
                break;
            } else {
                System.out.println("Invalid.");
            }
        }
    }
}
