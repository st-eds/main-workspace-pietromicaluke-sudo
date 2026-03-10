import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wins = 0;
        int losses = 0;
        int round = 1;
        boolean playing = true;
        String player = "";
        String computer = "";

        System.out.println("--- Rock, Paper, Scissors ---");

        while (playing) {
            System.out.println("Round " + round);
            System.out.println("W: " + wins + " - L: " + losses + "\n");

            System.out.print("(rock, paper, scissors): ");
            player = input.nextLine().toLowerCase();

            int random = (int)(Math.random() * 3);

            if (random == 0) {
                computer = "rock";
            }
            else if (random == 1) {
                computer = "paper";
            }
            else {
                computer = "scissors";
            }

            System.out.println("Computer chooses " + computer + "!");

            if (player.equals(computer)) {
                System.out.println("-TIE-");
            }
            else if (
                (player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))
            ) {
                System.out.println("-YOU WIN-");
                wins++;
            }
            else {
                System.out.println("-YOU LOSE-");
                losses++;
            }

            round++;

            System.out.print("Play again? (yes/no) ");
            String choice = input.nextLine();

            if (choice.equals("no")) {
                playing = false;
            }

            System.out.println("\n--- Final Score ---");
            System.out.println("Wins: " + wins + " - Losses: " + losses);
            System.out.println("Thanks for playing!");
        }
        // 1. I would change the condition to say "while (playing != 5)"
        // and make playing an int that starts at 0 and increases by one
        // after each round.
    }
}