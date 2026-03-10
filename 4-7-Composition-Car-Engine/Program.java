import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Car car = new Car("Honda", "Civic");
        Engine smallEngine = new Engine(140);
        Engine sportEngine = new Engine(220);

        System.out.println("-- Composition Demo: Car has-an Engine --");
        System.out.println(car.getStatus());

        boolean running = true;

        while (running)
        {
            System.out.println("\n--- Menu ---");
            System.out.println("1) Show status");
            System.out.println("2) Install 140 HP engine");
            System.out.println("3) Install 220 HP engine");
            System.out.println("4) Remove engine");
            System.out.println("5) Start car");
            System.out.println("6) Stop car");
            System.out.println("7) Print engine horsepower (AP-style)");
            System.out.println("8) Quit");
            System.out.print("> ");

            String choice = input.nextLine();

            if (choice.equals("1"))
            {
                System.out.println(car.getStatus());
            }
            else if (choice.equals("2"))
            {
                car.installEngine(smallEngine);
                System.out.println("Installed 140 HP engine.");
                System.out.println(car.getStatus());
            }
            else if (choice.equals("3"))
            {
                car.installEngine(sportEngine);
                System.out.println("Installed 220 HP engine.");
                System.out.println(car.getStatus());
            }
            else if (choice.equals("4"))
            {
                car.removeEngine();
                System.out.println("Engine removed.");
                System.out.println(car.getStatus());
            }
            else if (choice.equals("5"))
            {
                car.start();
                System.out.println(car.getStatus());
            }
            else if (choice.equals("6"))
            {
                car.stop();
                System.out.println(car.getStatus());
            }
            else if (choice.equals("7"))
            {
                int hp = car.getEngineHorsepower();

                if (hp == -1)
                {
                    System.out.println("Horsepower: (no engine installed)");
                }
                else
                {
                    System.out.println("Horsepower: " + hp);
                }
            }
            else if (choice.equals("8"))
            {
                running = false;
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("\nGoodbye!");
    }
}
// 1. When a car "has-an" engine there is a value for the engine and
// the engine is able to run tasks like running.

// 2. The Car's engine might be null in the program if no engine has
// been installed yet so all of its attributes are also unknown.

// 3. The start() method in Car uses delegation. It is being
// delegated to the start() method in Engine.

// 4. This may cause an error that wouldn't allow the code to run.

// 5. getEngineHorsepower() returns a -1 to indicate that an engine
// isn't even installed. A 0 could indicate that an engine is
// installed and has zero horsepower, which just isn't true.