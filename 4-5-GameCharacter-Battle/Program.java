import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GameCharacter player = new GameCharacter("Hero", 100, 15);
        GameCharacter enemy = new GameCharacter("Goblin", 75, 10);

        System.out.println("-- Turn-Based Battle --");

        while (!player.isDefeated() && !enemy.isDefeated())
        {
            System.out.println("\n" + player.getName() + " HP: " + player.getCurrentHealth());
            System.out.println(enemy.getName() + " HP: " + enemy.getCurrentHealth());

            System.out.println("\nChoose an action:");
            System.out.println("1) Attack");
            System.out.println("2) Heal");
            System.out.print("> ");
            String choice = input.nextLine();

            if (choice.equals("1"))
            {
                player.attack(enemy);
                System.out.println("\nYou dealt " + player.getAttackPower() + " damage!");
            }
            else if (choice.equals("2")) {
                player.heal(10);
                System.out.println("\nYou healed 10 HP.");
            }
            else
            {
                System.out.println("Invalid choice. You lose your turn!");
            }

            if (enemy.isDefeated())
            {
                break;
            }

            enemy.attack(player);
            System.out.println("The " + enemy.getName() + " attacks for " + enemy.getAttackPower() + " damage!");
        }

        if (player.isDefeated())
        {
            System.out.println("\nYou were defeated...");
        }
        else
        {
            System.out.println("\nYou defeated the enemy!");
        }
    }
}
// 1. Health should never go below 0 or above maxHealth because the
// player should die when health reaches 0 and maxHealth indicates
// that the player's health is full and can't get any more healthy.

// 2. Encapsulation protects the variables by preventing corruption
// of the variables and setting rules for values to be entered into
// them.

// 3. A loop is used to repeat the same actions of the game until
// either the hero or the goblin is defeated.

// 4. Instance methods make modifying variables and finding
// solutions to problems easier to repeat and it minimizes errors in
// code.

// 5. I could add more instance variables in the GameCharacter class
// which are integers to keep track of how many items/spells the
// characters have. If they have a positive amount of items, then
// they can use the items in their battle.