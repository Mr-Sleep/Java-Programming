import java.util.Scanner;
//Multiplication Table Using For Loop
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        for(int i = 1; i<11; i++){
            int multiply = num * i;
            System.out.println(num + " x " + i + " = " + multiply);
        }
    }
}
