import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lives = 3;
        while(lives > 0) {
            System.out.println("Which programming language is ideal for Android Development?");
            System.out.println("Java, Kotlin, Flutter, React Native");
            System.out.print("Enter Answer: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("kotlin")) {
                System.out.println("You Won!");
                break;
            } else {
                System.out.println("Try Again");
                System.out.println();
                lives--;
            }
            if (lives == 0){
                System.out.println("Game Over");
            }

        }
    }
}
