import java.util.Scanner;
//Area and Perimeter Of Rectangle
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Width: ");
        double width = scan.nextDouble();

        System.out.print("Enter Height: ");
        double height = scan.nextDouble();

        //formula
        float area,perimeter;
        area = (float) (width * height);
        perimeter = (float) (2 * (width + height));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
