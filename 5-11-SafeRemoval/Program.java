import java.util.ArrayList;

public class Program
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();

        words.add("cat");
        words.add("house");
        words.add("sun");
        words.add("computer");
        words.add("pen");
        words.add("keyboard");
        words.add("tree");
        words.add("mouse");

        System.out.println("Before: " + words);
        for (int i = words.size() - 1; i >= 0; i--) {
            if (words.get(i).length() < 4) {
                words.remove(i);
            }
        }
        System.out.println("After: " + words);

        System.out.println();
        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(85);
        grades.add(62);
        grades.add(90);
        grades.add(74);
        grades.add(55);
        grades.add(88);
        grades.add(69);
        grades.add(95);
        grades.add(72);
        grades.add(60);

        System.out.println("Original: " + grades);

        int removed = 0;

        for (int i = grades.size() - 1; i >= 0; i--) {
            if (grades.get(i) < 70) {
                grades.remove(i);
                removed ++;
            }
        }

        System.out.println("Filtered: " + grades);
        System.out.println("Removed count: " + removed);
    }
}

// 1. Forward removal skips elements because if it removes an element,
// the elements to the right will shift to the left, so when the next
// index is evaluated, it skips the element that was orignally there
// because it has moved to the previous index.

// 2. Backward traversal fixes the problem because it evaluates the
// values from right to left, so if one is removed, none of the values
// that haven't been evaluated yet will have been moved.

// 3. For-each loops act like forward removal because they can only move
// from left to right.

// 4. You could filter a list in order to eliminate students below a
// certain gpa in order to figure out which students are classified for
// honors.
