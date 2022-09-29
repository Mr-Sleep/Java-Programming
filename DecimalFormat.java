import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Decimal: ");
        double num1 = s.nextDouble();

        System.out.print("Enter Second Decimal: ");
        double num2 = s.nextDouble();

        System.out.println("First Number: " + String.format("%.3f", num1));
        System.out.println("Second Number: " + String.format("%.3f", num2));
    }
}
