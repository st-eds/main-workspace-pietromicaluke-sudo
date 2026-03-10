import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 10) + 1;
        int guess = 0;
        int tries = 0;

        while (guess != secretNumber) {
            System.out.print("Guess the number (1-10): ");
            guess = input.nextInt();
            tries++;

            if (guess == secretNumber) {
                System.out.println("Correct! It took you " + tries + " tries!");
            }
            else if (guess < 1 || guess > 10) {
                System.out.println("Your guess was out of range.");
            }
            else if (guess > secretNumber) {
                System.out.println("Wrong! Your guess was too high.");
            }
            else {
                System.out.println("Wrong! Your guess was too low.");
            }
        }
        // 1. The while loop allows the player to keep guessing
        // and getting more information to help them get
        // closer and closer to the number until they get
        // it right. Once they get the right number, the
        // while loop ends.

        // 2. The if/else if/else statements were used to
        // determine where the player's guess landed in
        // relation to the actual number (ex. higher/lower),
        // then informed the user of where their guess
        // landed in relation to the actual number. The
        // user could then use this information to elimnate
        // a certain amount of numbers and guess closer to
        // the actual number.
    }
}