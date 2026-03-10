import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int requiredKeyCode = 1234;

        Lock doorLock = new Lock(requiredKeyCode);

        String roomName = "Locked Lab";
        String clue = "You notice scratch marks near a loose floor tile.";

        Item hiddenKey = new Item("Brass Key", requiredKeyCode);

        Room room = new Room(roomName, clue, doorLock, hiddenKey);
        Player player = new Player();

        System.out.println("--- ESCAPE ROOM ---");
        System.out.println("You wake up in a locked room. The door is sealed.");
        System.out.println("Room: " + room.getName());

        boolean running = true;

        while (running)
        {
            System.out.println();
            System.out.println("Held item: " + player.getHeldItemName());
            System.out.println("1) Search room");
            System.out.println("2) Take item");
            System.out.println("3) Inspect held item");
            System.out.println("4) Try unlock door");
            System.out.println("5) Drop held item");
            System.out.println("6) Quit");
            System.out.print("> ");

            String choice = input.nextLine();

            if (choice.equals("1"))
            {
                System.out.println(room.search());
            }
            else if (choice.equals("2"))
            {
                Item found = room.takeItem();

                if (found == null)
                {
                    System.out.println("You don't find anything you can take.");
                }
                else
                {
                    boolean pickedUp = player.pickUp(found);

                    if (pickedUp)
                    {
                        System.out.println("You picked up: " + found.getName());
                    }
                    else
                    {
                        System.out.println("Your hands are full. Drop your item first.");
                    }
                }
            }
            else if (choice.equals("3"))
            {
                System.out.println(player.inspectHeldItem());
            }
            else if (choice.equals("4"))
            {
                boolean unlocked = room.tryUnlockDoor(player.getHeldItem());

                if (unlocked)
                {
                    System.out.println("Click! The lock opens.");
                    System.out.println("YOU ESCAPED!");
                    running = false;
                }
                else
                {
                    if (player.hasItem())
                    {
                        System.out.println("That didn't work. The door remains locked.");
                    }
                    else
                    {
                        System.out.println("You try the door... It won't budge. (You have no key.)");
                    }
                }
            }
            else if (choice.equals("5"))
            {
                Item dropped = player.dropItem();

                if (dropped == null)
                {
                    System.out.println("You have nothing to drop.");
                }
                else
                {
                    System.out.println("You dropped: " + dropped.getName());
                }
            }
            else if (choice.equals("6"))
            {
                running = false;
            }
            else
            {
                System.out.println("Invalid choice.");
            }

            if (!room.isDoorLocked())
            {
                running = false;
            }
        }

        System.out.println("\nGame over.");
    }
}

// 1. The Room Class has a Lock. The Player Class has an Item.

// 2. null can occur when the Player doesn't have an Item yet.
// null can also occur when the Player obtains the key, thus
// leaving the room with zero remaining items.

// 3. The sentinel value is "none" which is uselful because it
// communicates that their is no item being held by the user.

// 4. The Lock class "owns" the unlocking logic. This is a good
// design because the logic correlates with the actual class that
// it interacts with, making it also easy to find and navigate in
// the code.

// 5. You could add more items that the player could hold and
// interact with.