import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Chinese Zodiac Calendar ---");
        System.out.print("Enter your birth year: ");

        int birthYear = input.nextInt();
        int zodiacNumber = birthYear % 12;
        String zodiacAnimal;

        input.nextLine();

        if (zodiacNumber == 0) {
            zodiacAnimal = "monkey";
        }
        else if (zodiacNumber == 1) {
            zodiacAnimal = "rooster";
        }
        else if (zodiacNumber == 2) {
            zodiacAnimal = "dog";
        }
        else if (zodiacNumber == 3) {
            zodiacAnimal = "pig";
        }
        else if (zodiacNumber == 4) {
            zodiacAnimal = "rat";
        }
        else if (zodiacNumber == 5) {
            zodiacAnimal = "ox";
        }
        else if (zodiacNumber == 6) {
            zodiacAnimal = "tiger";
        }
        else if (zodiacNumber == 7) {
            zodiacAnimal = "rabbit";
        }
        else if (zodiacNumber == 8) {
            zodiacAnimal = "dragon";
        }
        else if (zodiacNumber == 9) {
            zodiacAnimal = "snake";
        }
        else if (zodiacNumber == 10) {
            zodiacAnimal = "horse";
        }
        else if (zodiacNumber == 11) {
            zodiacAnimal = "sheep";
        }
        else {
            System.out.println("Error: invalid input");
            zodiacAnimal = "something went wrong";
        }

        System.out.println("\nBirth year: " + birthYear + " - You are the year of the..." + zodiacAnimal + "!");

        System.out.println("Press enter to continue...");
        input.nextLine();

        System.out.println("\n--- Lottery Game ---\n");
        System.out.println("Rules: Pick two lottery numbers ranging from 0 to 9");
        System.out.println("Match two numbers and win BIG!");
        System.out.println("Match one number in order and win SMALL!\n");

        System.out.print("Enter your 1st lottery number (0 to 9): ");
        int lottoNum1 = input.nextInt();

        System.out.print("Enter your 2nd lottery number (0 to 9): ");
        int lottoNum2 = input.nextInt();

        int winningNum1 = (int)(Math.random() * 10);
        int winningNum2 = (int)(Math.random() * 10);

        if (lottoNum1 < 0 || lottoNum1 > 9 || lottoNum2 < 0 || lottoNum2 > 9) {
            System.out.println("Error: Your lotto numbers are invalid. Exiting");
            System.exit(0);
        }

        System.out.println("The winning numbers are " + winningNum1 + " and " + winningNum2);

        if (lottoNum1 == winningNum1 && lottoNum2 == winningNum2) {
            System.out.println("You win BIG!");
        }
        else if (lottoNum1 == winningNum1 || lottoNum2 == winningNum2) {
            System.out.println("You win SMALL!");
        }
        else {
            System.out.println("You lose! Better luck next time!");
        }

// 1. Using "if, else if, else" statements allows the program to
// only follow one outcome based on the input. A seperate if
// statement would be appropriate to produce multiple outcomes
// to an input. For instance, if a person enters their age, the
// program can tell them multiple things about their age (if they
// can drive, vote, run for president, etc.).

// 2. The else block is used to demonstrate that the user's input
// does not apply to any of the possible outcomes, meaning that
// it is used after all other code blocks have come back as false
// and acts as a "catch-all."
    }
}