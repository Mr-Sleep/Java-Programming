import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quizTotal = 5;
        int score = 0;
        int checker;
        char res;

        do {
            System.out.println("Question 1");
            System.out.println("Who is the father of Java?");
            System.out.println("A. Mark Zuckerberg");
            System.out.println("B. Elon Musk");
            System.out.println("C. James Gosling");
            System.out.print("Answer: ");
            char ans1 = sc.next().charAt(0);

            System.out.println();

            System.out.println("Question 2");
            System.out.println("It is a container that holds certain value");
            System.out.println("A. Variable");
            System.out.println("B. Identifier");
            System.out.println("C. Keyword");
            System.out.print("Answer: ");
            char ans2 = sc.next().charAt(0);

            System.out.println();

            System.out.println("Question 3");
            System.out.println("Popular Programming Language of 2022?");
            System.out.println("A. Java");
            System.out.println("B. Kotlin");
            System.out.println("C. JavaScript");
            System.out.print("Answer: ");
            char ans3 = sc.next().charAt(0);

            System.out.println();

            System.out.println("Question 4");
            System.out.println("Who created Kotlin?");
            System.out.println("A. Google");
            System.out.println("B. JetBrains");
            System.out.println("C. Microsoft");
            System.out.print("Answer: ");
            char ans4 = sc.next().charAt(0);

            System.out.println();

            System.out.println("Question 5");
            System.out.println("Programming Language of Flutter?");
            System.out.println("A. Dart");
            System.out.println("B. Python");
            System.out.println("C. Ruby");
            System.out.print("Answer: ");
            char ans5 = sc.next().charAt(0);

            //Checking
            if (ans1 == 'C' || ans1 == 'c') {
                score++;
            }

            if (ans2 == 'A' || ans2 == 'a') {
                score++;
            }

            if (ans3 == 'C' || ans3 == 'c') {
                score++;
            }

            if (ans4 == 'B' || ans4 == 'b') {
                score++;
            }

            if (ans5 == 'A' || ans5 == 'a') {
                score++;
            }
            System.out.println();
            System.out.println("Score: " + score + "/" + quizTotal);
            score = 0;

            do {
                System.out.print("Do you want to try again? [Y] for yes/ [N] for no: ");
                res = sc.next().charAt(0);
                System.out.println();
                if (res == 'N' || res == 'n') {
                    checker = 2;
                    break;
                }else if (res == 'Y' || res == 'y'){
                    checker = 0;
                }else {
                    checker = 1;
                }
            }while (checker == 1);

        }while (checker == 0);
        System.out.println("Thanks for playing!");
    }
}
