import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        final String GREEN_TEXT = "\u001B[32m";
        final String RED_TEXT = "\u001B[31m";
        final String WHITE_TEXT = "\u001B[37m";
        Scanner input = new Scanner(System.in);

        System.out.println("--- Demo 1 - Multiplication Table ---");

        System.out.print("Enter the size of the table: ");
        int size = input.nextInt();

        for (int i = 0; i <= size; i++)
        {
            if (i == 0)
                System.out.print("\t");
            else
                System.out.print(GREEN_TEXT + i + "\t");
        }

        System.out.println();

         for (int num1 = 1; num1 <= size; num1++)
        {
            System.out.print(GREEN_TEXT + num1 + "\t" + WHITE_TEXT);

            for (int num2 = 1; num2 <= size; num2++)
            {
                System.out.print(num1 * num2 + "\t");
            }

            System.out.println();
        }

        input.nextLine();
        System.out.print("Press enter to continue...");
        input.nextLine();

        // 1. Making a multiplication table requires nested loops
        // because it helps create seperate columns and rows.
    }
}