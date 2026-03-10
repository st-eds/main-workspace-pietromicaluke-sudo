import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- application-2-5 ---\n");
        System.out.println("Welcome to Heads or Tails!");
        String playing = "yes";
        String coin = "";
        String outcome = "";
        int wins = 0;
        int losses = 0;
        while (playing.equals("yes")) {
            System.out.print("Guess the outcome (heads/tails): ");
            String guess = input.nextLine();
            int flip = (int)(Math.random() * 2) + 1;
            if (flip == 1) {
                coin = "heads";
            }
            else {
                coin = "tails";
            }
            if (guess.equals(coin)) {
                outcome = "win!";
                wins ++;
            }
            else {
                outcome = "lose!";
                losses ++;
            }
            System.out.println("It's " + coin + "! You " + outcome);
            System.out.println("Wins: " + wins + " | Losses: " + losses);
            System.out.print("\nDo you want to play again? (yes/no): ");
            playing = input.nextLine();
            System.out.println();
        }
        System.out.println("Thanks for playing! Final score: Wins: " + wins + " | Losses: " + losses);
        System.out.println("\n--- application-2-6 ---\n");
        System.out.print("Enter the number of times to flip the coin: ");
        int flips = input.nextInt();
        int result = (int)(Math.random() * 2) + 1;
        int counterH = 0;
        int counterT = 0;
        for (int i = 1; i <= flips; i++) {
            result = (int)(Math.random() * 2) + 1;
            if (result == 1) {
                counterH++;
                System.out.println("Flip " + i + ": Heads");
            }
            else {
                counterT++;
                System.out.println("Flip " + i + ": Tails");
            }
        }
        double percentH =  (double) counterH / (counterH + counterT);
        percentH = percentH * 10000;
        percentH = (int) percentH;
        percentH = (double) percentH / 100;
        double percentT =  (double) counterT / (counterH + counterT);
        percentT = percentT * 10000;
        percentT = (int) percentT;
        percentT = (double) percentT / 100;
        System.out.println("\nResults:");
        System.out.println("Heads: " + counterH + " (" + percentH + "%)");
        System.out.println("Tails: " + counterT + " (" + percentT + "%)");
        System.out.println("\n--- application-2-7 ---\n");
        System.out.println("Kilograms\tPounds");
        for (int i = 1; i <= 199; i += 2) {
            System.out.println(i + "\t\t" + (i * 2.2));
        }

    }
}