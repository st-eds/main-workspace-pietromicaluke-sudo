import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- application-2-3 ---\n");
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();
        double bmi = (weight / (height * height)) * 703;
        String category = "";

        if (bmi < 18.5) {
            category = "Underweight.";
        }
        else if (bmi < 25) {
            category = "Normal weight.";
        }
        else if (bmi < 30) {
            category = "Overweight.";
        }
        else {
            category = "Obesity.";
        }
        bmi *= 100;
        bmi = (int) bmi;
        bmi = (double) bmi;
        bmi /= 100;
        System.out.println("Your BMI is " + bmi + ", which is considered " + category);

        System.out.println("\n\n\n--- application-2-4 ---\n");
        input.nextLine();
        System.out.print("Is the PC powering on? (yes/no): ");
        String pcOn = input.nextLine();
        if (pcOn.equals("yes")) {
            System.out.print("Is there any display on the moniter? (yes/no): ");
            String display = input.nextLine();
            if (display.equals("yes")) {
                System.out.print("Is the PC booting into the operating system? (yes/no): ");
                String booting = input.nextLine();
                if (booting.equals("yes")){
                    System.out.print("Is the PC running slowly or freezing? (yes/no): ");
                    String running = input.nextLine();
                    if (running.equals("yes")) {
                        System.out.println("\nCheck for malware, update drivers, and ensure there is enough free disk space. \nIf the problem persists, consider upgrading the hardware.");
                    }
                    else if (running.equals("no")) {
                        System.out.println("\nThe PC is functioning normally.");
                    }
                }
                else if (booting.equals("no")) {
                    System.out.println("\nCheck the BIOS settings and ensure the boot drive is properly connected. \nIf the problem persists, try booting from a different drive or reinstalling the operating system.");
                }
            }
            else if (display.equals("no")) {
                System.out.println("\nCheck the monitor connections and ensure the monitor is turned on. \nIf the problem persists, try using a different moniter or graphics card.");
            }
        }
        else if (pcOn.equals("no")) {
            System.out.println("\nCheck the power supply connections and ensure the power outlet is working.\nIf the problem persists, replace the power supply.");
        }
    }
}