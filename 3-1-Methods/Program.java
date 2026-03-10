import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        showIntro();
        do
        {
            displayMenu();
            System.out.print("Choose mini-game: ");
            choice = input.nextLine();

            switch (choice)
            {
                case "1": playGuessTheNumber(); break;
                case "2": playLuckyDice(); break;
                case "3": playSpinTheWheel(); break;
                case "4": gameOver(); break;
                default: System.out.println("Invalid choice.");
            }

            System.out.println();

        } while (!choice.equals("4"));
    }

    static void showIntro()
    {
        System.out.println("=== MINI GAME COLLECTION VOL. 1 ===");
        System.out.println("Welcome!");
        System.out.println();
    }

    static void displayMenu()
    {
        System.out.println("1. Guess the Number");
        System.out.println("2. Lucky Dice");
        System.out.println("3. Spin the Wheel");
        System.out.println("4. Exit");
        System.out.println();
    }

    static void gameOver()
    {
        System.out.println("Thanks for playing!");
        System.out.println("Goodbye!");
    }

    static void playGuessTheNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Guess the Number ---");
        System.out.print("Guess my secret number between 1 and 10: ");
        int secret = (int)((Math.random() * 10) + 1);
        int guess = input.nextInt();

        System.out.println("It was " + secret + "!");
        System.out.println(guess == secret ? "You Win!" : "You Lose!");
    }

    static void playLuckyDice () {
        System.out.println("This game is still in progress. Please choose another option...");
    }

    static void playSpinTheWheel() {
        System.out.println("This game is still in progress. Please choose another option...");
    }
    // 1. Defining a method makes the code modular, which makes the
    // code more organized and easier to read and modify.

    // 2. Invoking a method allows you to reuse code as much as you
    // want because you can just keep invoking it by typing a simple
    // identifier over and over. It also organizes code because you
    // can just type that indentifier instead of retyping everything
    // under the method.

    // 3. I noticed the patterns that the identifier is always at
    // the top of the method, which is followed by curly brackets
    // with the  code on the inside. Also, the words "static void"
    // come before each of the identifiers.
}