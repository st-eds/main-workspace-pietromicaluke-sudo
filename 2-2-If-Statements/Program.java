    import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Demo 1 - Age Validator ---");

        System.out.print("enter your age: ");
        int userAge = input.nextInt();

        if (userAge >= 16) {
            System.out.println("Time to hit the road! You've earned your driving permit.\n");
        }

        if (userAge >= 18){
            System.out.println("Adulting 101: You can now vote and live independently.");
        }

        if (userAge >= 35) {
            System.out.println("You're old enough to run for president.");

            System.out.print("Enter your full name: ");
            String fullName = input.nextLine();

            System.out.print("What year will you run? ");
            String electionYear = input.nextLine();

            System.out.print("What's your nickname (e.g., 'The Awesome')? ");
            String nickName = input.nextLine();

            System.out.println(nickName + " " + fullName + " for president in " + electionYear + "!");
        }

        System.out.println("Press enter to continue...");
        input.nextLine();

        System.out.println("\n--- Demo 2 - Simple Score Calculator ---");

        System.out.print("Enter your score (0-100): ");
        int score = input.nextInt();

        if (score >= 60) {
            System.out.println("You passed!");
        }

         if (score < 60) {
            System.out.println("You did not pass. Keep studying!");
        }

        System.out.println("Press enter to continue...");
        input.nextLine();

        System.out.println("\n--- Demo 3 - Temperature Check ---");

        System.out.print("What is the current temperature in Farenheit? ");
        int currentTemp = input.nextInt();

        input.nextLine();

        if (currentTemp <= 32) {

            
        }
    }
}