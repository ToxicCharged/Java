import java.util.Scanner;

public class Circle
{
    public static void chief() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r;

        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Area of circle: " + area);
    }
}
