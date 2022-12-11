import java.util.Scanner;

public class Rectangle
{
    public static void chief()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Rectangle:");
        double l = sc.nextDouble();
        System.out.println("Enter breadth of Rectangle:");
        double b = sc.nextDouble();
        sc.nextLine();

        System.out.println("Choose between: area, perimeter, diagonal");
        String choice = sc.nextLine();

        switch (choice) {
            case "area": System.out.println("Area = " + (l*b)); break;
            case "perimeter": System.out.println("Perimeter = " + 2*(l+b)); break;
            case "diagonal": System.out.println("Diagonal = " + Math.sqrt(Math.pow(l,2) + Math.pow(b,2))); break;
            default: System.out.println("Invalid choice");
        }
    }
}
