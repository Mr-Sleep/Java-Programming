import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = s.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = s.nextInt();

        System.out.print("A for Addition, M for Multiplication, S for Subtraction, D for Division, R for Modulo: ");
        char choice = s.next().charAt(0);

        //Formula
        int add = num1 + num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;
        int product = num1 * num2;
        int modulo = num1 % num2;

        if(choice == 'A'){
            System.out.println("Sum: " + num1 + " + " + num2 + " = " + add);
        }
        if(choice == 'S'){
            System.out.println("Difference: " + num1 + " - " + num2 + " = " + subtract);
        }
        if(choice == 'M'){
            System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
        }
        if(choice == 'D'){
            System.out.println("Quotient: " + num1 + " / " + num2 + " = " + divide);
        }
        if(choice == 'R'){
            System.out.println("Modulo: " + num1 + " % " + num2 + " = " + modulo);
        }
    }
}
