import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scan.nextInt();

        System.out.print("Enter Third Number: ");
        int thirdNumber = scan.nextInt();

        //Formula
        int average = (firstNumber + secondNumber + thirdNumber)/3;

        //Print Average
        System.out.println("Average: " +average);
    }
}
