import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        String[] names = {"Ava", "Ben", "Chris", "Dina", "Eli"};
        int[] scores = {88, 73, 95, 67, 81};

        System.out.println("Roster:");
        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i] + ": " + scores[i]);
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }
        double avg = (double) sum / scores.length;
        System.out.println("Average: " + avg);

        int bestIndex = 0;
        for (int i = 1; i < scores.length; i++)
        {
            if (scores[i] > scores[bestIndex])
            {
                bestIndex = i;
            }
        }
        System.out.println("Top student: " + names[bestIndex]);
        System.out.println("Top score: " + scores[bestIndex]);

        int passing = 0;
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] >= 70)
            {
                passing++;
            }
        }
        System.out.println("Passing count: " + passing);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name to look up: ");
        String targetName = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals(targetName))
            {
                index = i;
            }
        }

        if (index == -1)
        {
            System.out.println("Not found.");
        }
        else
        {
            System.out.println(targetName + "'s score: " + scores[index]);
        }
        
        String[] questions =
        {
            "What is 2 + 2?",
            "What keyword starts a for loop in Java?",
            "What is the first index in an array?",
            "True/False: Arrays can change size after creation."
        };

        String[] answers =
        {
            "4",
            "for",
            "0",
            "false"
        };

        int correct = 0;

        System.out.println("Quiz Time!");
        System.out.println("----------");

        for (int i = 0; i < questions.length; i++)
        {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String user = scanner.nextLine();

            if (user.equalsIgnoreCase(answers[i]))
            {
                System.out.println("Correct!");
                correct++;
            }
            else
            {
                System.out.println("Incorrect. The answer was: " + answers[i]);
            }

            System.out.println();
        }

        System.out.println("Final Score: " + correct + " / " + questions.length);

        scanner.close();
    }
}

// 1. "same index = same record" means that the same index is used to classify a certain
// set of related information across multiple arrays. For instance one index might be used
// to find the name, grade, and gpa of a student by pulling information from multiple arrays.

// 2. It is safer to use bestIndex because the index can then be easily used to determine
// the student with the best score.

// 3. The value -1 means that no element was found that matched the value requested.

// 4. If two paralell arrays are not the same length, then errors could occur when running
// through both arrays in a loop after the shortest parallel array has been fully evaluated.