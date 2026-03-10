import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Demo 1: Prime Number Checker ---");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + " is " + (isPrime ? "prime" : "not prime"));

        input.nextLine();
        System.out.print("Press enter to continue...");
        input.nextLine();

        System.out.println("\n--- Demo 3: Number Analyzer ---");

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            int n = input.nextInt();

            if (n == 0)
            {
                System.out.println("Skipping zero...");
                continue;
            }

            String sign = (n > 0) ? "positive" : "negative";
            String parity = (n % 2 == 0) ? "even" : "odd";

            System.out.println(n + " is " + sign + " and " + parity + ".");
        }
    }
}