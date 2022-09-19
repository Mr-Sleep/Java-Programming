import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scan.nextInt();

        //formulas
        int add = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;
        int modulo = firstNumber% secondNumber;

        //Print
        System.out.println(firstNumber + " + " + secondNumber + " = " + add);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
        System.out.println(firstNumber + " % " + secondNumber + " = " + modulo);
    }
}
