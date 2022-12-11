import java.util.Scanner;

public class LCMandHCF {
    public static void chief() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Math.min(x, y);
        int hcf = 0;
        for (int i = 1; i <= min; i += 1) {
            if (x % i == 0 && y % i == 0 && i > hcf) {
                hcf = i;
            }
        }
        int lcm = (x * y) / hcf;

        System.out.println("LCM is: " + lcm);
        System.out.println("HCF is: " + hcf);
    }
}
