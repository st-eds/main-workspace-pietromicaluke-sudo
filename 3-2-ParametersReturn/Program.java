import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Math Utilities ---");

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        greetUser(userName);

        System.out.print("Enter a number to square: ");
        int num = input.nextInt();

        int result = square(num);
        System.out.println("The square is " + result + "\n");

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        
        double avg = average(a, b);
        System.out.println("The average is " + avg + "\n");

        System.out.print("Enter minimum value: ");
        int min = input.nextInt();

        System.out.print("Enter maximum value: ");
        int max = input.nextInt();

        int random = randomInRange(min, max);
        System.out.println("Random number between " + min + " and " + max + ": " + random + "\n");
    }
    static void greetUser(String name)
    {
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to the Math Utility Program.\n");
    }
    static int square(int n)
    {
        return n * n;
    }
    static double average(double a, double b)
    {
        return (a + b) / 2.0;
    }
    static int randomInRange(int min, int max)
    {
        return (int)((Math.random() * (max - min + 1)) + min);
    }
    // 1. A parameter is the variable used in the method
    // that stores information and an argument refers to
    // the information that is being stored.

    // 2. Void return types don't return any value, but
    // instead just performs code. Hence, a non-void return
    // type is needed to return any type of value.

    // 3. One method's return value could be used as input
    // to another method if the identifier of one method is
    // typed in the parenthesis after the identifier of the
    // other method.
    // Example: methodOne(methodTwo(double/int variable));
    
    // 4. Using parameters and returns is more flexible
    // than relying on global variables because you can
    // reuse variable names and don't need to create a ton
    // of global variable to accomplish one, simple task.
}