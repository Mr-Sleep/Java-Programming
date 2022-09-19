import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = scan.nextDouble();

        final double PI = 3.141592653589793238462643;

        double area = PI * (radius)*(radius);
        double perimeter = 2 * PI * radius;

        System.out.println("Perimeter is = " +perimeter);
        System.out.println("Area is = " +area);
        }
    }
