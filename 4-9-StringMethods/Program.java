public class Program
{
    public static void main(String[] args)
    {
        String word = "computer";

        System.out.println("Word: " + word);
        System.out.println("Length: " + word.length());
        System.out.println("First character: " + word.substring(0, 1));
        System.out.println("Last character: " + word.substring(word.length() - 1));
        System.out.println("Uppercase: " + word.toUpperCase());

        System.out.println();

        String fullName = "Grace Hopper";

        int spaceIndex = fullName.indexOf(" ");

        String firstInitial = fullName.substring(0, 1);
        String lastInitial = fullName.substring(spaceIndex + 1, spaceIndex + 2);

        System.out.println(firstInitial + "." + lastInitial + ".");

        System.out.println();

        fullName = "Ada Lovelace";

        spaceIndex = fullName.indexOf(" ");

        firstInitial = fullName.substring(0, 1);
        String lastName = fullName.substring(spaceIndex + 1);

        String username = (firstInitial + lastName).toLowerCase();

        System.out.println("Username: " + username);

        System.out.println();

        String sentence = "The quick brown fox jumps over the lazy dog";
        String target = "fox";

        int index = sentence.indexOf(target);

        System.out.println("Sentence: " + sentence);
        System.out.println("Index of target: " + index);

        if (index == -1)
        {
            System.out.println("Target not found.");
        }
        else
        {
            System.out.println("Target found.");
        }

        System.out.println();

        String a = "Apple";
        String b = "banana";

        System.out.println("Equals? " + a.equals(b));
        System.out.println("compareTo: " + a.compareTo(b));
        System.out.println("a lowercase: " + a.toLowerCase());
        System.out.println("b lowercase: " + b.toLowerCase());
        System.out.println("a uppercase: " + a.toUpperCase());
        System.out.println("b uppercase: " + b.toUpperCase());
    }
}

// 1. You should use equals() instead of == for Strings because == checks
// if the Strings are specifically the same object, not if their contents
// are the same. On the other hand, equals() checks if the characters of
// both Strings are the same.

// 2. -1

// 3. substring(0, 3) only returns the first three characters because the
// 3 indicates that it stops right before the third character.

// 4. Strings are immutable because when their content is changed, it
// doesn't modify the original content of the String, it only creates a
// new content for the String.

// 5. compareTo() evaluates two Strings positions in relation to one
// another alphabetically, while equals() simpy checks if the contents of
// both Strings are the same.