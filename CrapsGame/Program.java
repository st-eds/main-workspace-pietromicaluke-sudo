import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("--- CRAPS ---");

        int point = 0;
        boolean gameOver;

        promptRoll();
        int roll = rollDice();
        gameOver = evaluateComeOutRoll(roll);

        if (!gameOver)
        {
            point = roll;
            System.out.println("The point is now " + point + ".");

            while (!gameOver)
            {
                promptRoll();
                roll = rollDice();
                gameOver = evaluatePointRoll(roll, point);
            }
        }
        System.out.println("Thanks for playing!");
    }

    static int rollDie()
    {
        return (int)(Math.random() * 6) + 1;
    }

    static int rollDice()
    {
        int d1 = rollDie();
        int d2 = rollDie();
        int total = d1 + d2;
        System.out.println("You rolled " + d1 + " + " + d2 + " = " + total);
        return total;
    }
    static void promptRoll()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to roll...");
        input.nextLine();
    }
    static boolean evaluateComeOutRoll(int roll)
    {
        if (roll == 7 || roll == 11)
        {
            System.out.println("Rolled a " + roll + "! You win!");
            return true;
        }
        else if (roll == 2 || roll == 3 || roll == 12)
        {
            System.out.println("Rolled a " + roll + ". You lose.");
            return true;
        }
        else
        {
            System.out.println("Rolled a " + roll + ".");
            return false;
        }
    }
    static boolean evaluatePointRoll(int roll, int point)
    {
        if (roll == point)
        {
            System.out.println("Rolled a " + roll + "! You win!");
            return true;
        }
        else if (roll == 7)
        {
            System.out.println("Rolled a 7. You lose.");
            return true;
        }
        else
        {
            System.out.println("Rolled a " + roll + ". Still shooting for " + point + ".");
            return false;
        }
    }
    // 1. The first method I added was the rollDie method,
    // which was good to start with because rolling the
    // dice is the fundamental action needed in order to
    // even play the game. Everything else is built off of
    // that action.

    // 2. Return values helped me control the game flow
    // because I could keep recycling/reusing methods and
    // continue the game without having to type a lot of
    // new code.

    // 3. After refactoring, main() focuses on continuing
    // the game and evaluating when to end it using the
    // other methods.
}