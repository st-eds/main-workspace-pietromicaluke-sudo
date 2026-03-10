import java.util.ArrayList;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        ArrayList<String> movies = new ArrayList<String>();

        movies.add("The Incredibles");
        movies.add("Spider-Man");
        movies.add("Toy Story");
        movies.add("Shrek");
        movies.add("Star Wars");

        System.out.println("Movies: " + movies);
        System.out.println("First: " + movies.get(0));

        movies.set(2, "Finding Nemo");

        System.out.println("Updated: " + movies);
        System.out.println();
        ArrayList<Integer> temps = new ArrayList<Integer>();

        temps.add(72);
        temps.add(68);
        temps.add(75);
        temps.add(70);
        temps.add(69);
        temps.add(82);
        temps.add(84);

        int sum = 0;
        int max = temps.get(0);
        int hotCount = 0;

        for (int t : temps)
        {
            sum += t;

            if (t > max)
            {
                max = t;
            }

            if (t >= 80)
            {
                hotCount++;
            }
        }

        double avg = (double) sum / temps.size();

        System.out.println("Temps: " + temps);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Count >= 80: " + hotCount);
        System.out.println();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        names.add("Ava");
        scores.add(40);

        names.add("Ben");
        scores.add(55);

        names.add("Chris");
        scores.add(20);

        names.add("Dina");
        scores.add(65);

        names.add("Eli");
        scores.add(35);

        System.out.println("Scoreboard:");
        printScoreboard(names, scores);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a player name: ");
        String target = scanner.nextLine();

        int index = findIndex(names, target);

        if (index == -1)
        {
            System.out.println("Player not found.");
        }
        else
        {
            scores.set(index, scores.get(index) + 10);
            System.out.println("Added 10 points to " + names.get(index) + "!");
        }

        System.out.println("Updated scoreboard:");
        printScoreboard(names, scores);

        scanner.close();
        System.out.println();
        ArrayList<String> playlist = new ArrayList<String>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");
        playlist.add("Song F");

        playlist.remove(2);
        playlist.add(0, "Intro Track");

        for (int i = 0; i < playlist.size(); i++)
        {
            System.out.println(i + ": " + playlist.get(i));
        }
    }

    public static int findIndex(ArrayList<String> names, String target)
    {
        for (int i = 0; i < names.size(); i++)
        {
            if (names.get(i).equalsIgnoreCase(target))
            {
                return i;
            }
        }

        return -1;
    }

    public static void printScoreboard(ArrayList<String> names, ArrayList<Integer> scores)
    {
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i) + ": " + scores.get(i));
        }
    }
}

// 1. ArrayLists use size() because it's a different programming
// construct.

// 2. "remove shifts elements left" means that when an index/value is
// removed, all values to the right of the index shift to the left,
// which changes their index value negatively by one.

// 3. Integer is used because it refers to an object, not the actual
// primitive type of an int.

// 4. The number of a values in an ArrayList can be modified, while
// those in an array cannot.

// 5. "same index = same record" means that the same indexes from both
// lists represent different aspects of the same players.