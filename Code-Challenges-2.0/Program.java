import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- sprint-2-1 ---\n");
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = input.nextInt();
        String season;

        input.nextLine();

        if (birthMonth == 1 || birthMonth == 2 || birthMonth == 12) {
            season = " winter";
        }
        else if (birthMonth == 3 || birthMonth == 4 || birthMonth == 5) {
            season = " spring";
        } 
        else if (birthMonth == 6 || birthMonth == 7 || birthMonth == 8) {
            season = " summer";
        } 
        else if (birthMonth == 9 || birthMonth == 10 || birthMonth == 11) {
            season = " fall";
        } 
        else {
            System.out.println("ERROR: Invalid Input");
            season = "n unknown";
        }

        System.out.println("You're a" + season + " baby!");



        System.out.println("\n\n\n--- sprint-2-2 ---\n");
        System.out.print("Enter traffic light color: ");
        String color = input.nextLine();

        if (color.equals("green")) {
            System.out.println("Go! 🟢");
        }
        else if (color.equals("yellow")) {
            System.out.println("Prepare to stop! 🟡");
        }
        else if (color.equals("red")) {
            System.out.println("Stop! 🔴");
        }
        else {
            System.out.println("ERROR: Invalid Input");
        }
        
        System.out.println("\n\n\n--- sprint-2-3 ---\n");
        System.out.print("Enter your head size in inches: ");
        double inches = input.nextDouble();
        input.nextLine();
        
        if (inches <= 21) {
            System.out.println("Hat Size: Small");
            System.out.println("You're small.");
        }
        else if (inches <= 22.5) {
            System.out.println("Hat Size: Medium");
            System.out.println("Boring.");
        }
        else if (inches <= 24) {
            System.out.println("Hat Size: Large");
            System.out.println("Roomy for big ideas.");
        }
        else if (inches > 24) {
            System.out.println("Hat Size: Extra Large");
            System.out.println("Roomy for big ideas.");
        }
        else {
            System.out.println("ERROR: Invalid Input");
        }



        System.out.println("\n\n\n--- application-2-1 ---\n");
        System.out.print("Ask the Magic 8-Ball a question: ");
        input.nextLine();
        int selection = (int)(Math.random() * 6) + 1;
        String answer = "";

        if (selection == 1) {
            answer = "It is certain.";
        }
        else if (selection == 2) {
            answer = "Without a doubt.";
        }
        else if (selection == 3) {
            answer = "Ask again later.";
        }
        else if (selection == 4) {
            answer = "Cannot predict now.";
        }
        else if (selection == 5) {
            answer = "Don't count on it.";
        }
        else if (selection == 6) {
            answer = "Outlook not so good.";
        }
        System.out.println("Magic 8-Ball says: " + answer);

        System.out.println("\n\n\n--- application-2-2 ---\n");
        System.out.print("Enter the coefficient a: ");
        int a = input.nextInt();
        System.out.print("Enter the coefficient b: ");
        int b = input.nextInt();
        System.out.print("Enter the coefficient c: ");
        int c = input.nextInt();
        double discriminant = (Math.pow(b, 2)) - (4 * a * c);
        double root1 = 0;
        double root2 = 0;
        if (discriminant > 0) {
            root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots of the equation are: " + root1 + " and " + root2 + ".");
        } 
        else if (discriminant == 0) {
            root1 = (-1 * b) / (2 * a);
            System.out.println("The only root of the equation is: " + root1 + ".");
        }
        else if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        }
        else {
            System.out.println("ERROR: Invalid Input");
        }
    }
}