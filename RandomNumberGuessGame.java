import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Our Game!");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = obj.nextLine();
        System.out.println("Hello, " + name);
        for (int j = 0; j<6; j++){
        System.out.print("Shall We Start? Enter [Y] to Proceed and [N] to Cancel ");
        char response = obj.next().charAt(0);
        if (response == 'Y' || response == 'y') {
            Random random = new Random();
            int number = random.nextInt(10);
            int answer;

        for (int i = 1; i < 6; i++) {
            System.out.print("What's Your Guess? ");
            answer = obj.nextInt();
                if (number == answer) {
                    System.out.println("You are correct!");
                    break;
                } else {
                    System.out.println("Try Again");
                }
            }
            System.out.println("The correct answer is " +number);
        }
        else {
            System.out.println("You Quit");
            break;
        }
        }
    }
}
