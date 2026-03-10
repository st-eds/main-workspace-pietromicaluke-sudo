import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean wolfpackEnding = false;
        boolean dragonEnding = false;
        int gold = 0;
        int twinkies = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Your car crashes into a tree during a thunderstorm in the woods.");
        System.out.println("Darkness surrounds you as thunder crashes and rain pours.");
        System.out.println("You spot a cave nearby, dimly lit by flashes of lightning, and run towards it for shelter.");
        System.out.println("Inside, you see two shadowy paths diverging deeper into the unknown...\n");

        System.out.print("Which path do you take? (left or right) -> ");
        String path = input.nextLine().toLowerCase();

        if (path.equals("left") || path.equals("right")) {
            System.out.println("\nAs you move forward, you see something glimmering on the ground - a Hostess Twinkie.");
            System.out.println("Do you eat the Twinkie for sustenance, or will you save it for later?");

            System.out.print("(take or eat) -> ");
            String twinkieChoice = input.nextLine().toLowerCase();

            if (twinkieChoice.equals("take")) {
                System.out.println("You slip the Twinkie into your pocket, unsure what awaits in the darkness...\n");
                twinkies += 1;
            }
            else if (twinkieChoice.equals("eat")) {
                System.out.println("Feeling uneasy, you eat the Twinkie to keep up your strength.\n");

            }
            else {
                System.out.println("You leave the Twinkie untouched, feeling an ominous presence watching.\n");
            }

            if (path.equals("left")) {
                System.out.println("You cautiously take the left path.");
                System.out.println("An few steps in, you freeze as the piercing eyes of a pack of wolves emerge from the shadows.");
                System.out.println("The pack leader, larger and fiercer than the others, steps forward, growling softly...\n");

                System.out.print("Do you offer the pack leader your hand in peace? (yes or no) -> ");
                String wolfChoice = input.nextLine().toLowerCase();

                if (wolfChoice.equals("yes") && twinkies >= 1) {
                    System.out.println("As you reach out, the wolves smell the Twinkie...");
                    System.out.println("In a freezy of hunger, they turn on you, and you're surrounded with no escape!\n");
                }
                else if (wolfChoice.equals("yes")) {
                    System.out.println("The pack leader sniffs your hand and accepts you into the fold.");
                    System.out.println("You're given a small satchel of gold as a token of their trust.");
                    System.out.println("You settle in with the wolves, awaiting dawn as the storm howls outside...\n");
                    gold += 5;
                    wolfpackEnding = true;
                }
                else {
                    System.out.println("Sensing your hesitation, the wolves close in, their teeth bared.");
                    System.out.println("You feel their claws sink in, and everything goes black...\n");
                }
            }
            else if (path.equals("right")) {
                
            }
        }
    }
}