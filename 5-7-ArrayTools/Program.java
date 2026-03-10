import java.util.Arrays;

public class Program
{
    public static void main(String[] args)
    {
        int[] nums = {4, 7, 2, 9, 5};

        int sum = 0;

        for (int value : nums)
        {
            System.out.println(value);
            sum += value;
        }

        System.out.println("Sum: " + sum);
        System.out.println();
        int[] original = {1, 2, 3};

        int[] alias = original;
        alias[0] = 99;

        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++)
        {
            copy[i] = original[i];
        }

        copy[1] = 42;

        System.out.println("Original:");
        for (int v : original)
        {
            System.out.print(v + " ");
        }

        System.out.println("\nCopy:");
        for (int v : copy)
        {
            System.out.print(v + " ");
        }
        System.out.println("\n");
        int[] scores = {88, 73, 95, 67, 81};

        System.out.println("Before sort:");
        printArray(scores);

        Arrays.sort(scores);

        System.out.println("After sort:");
        printArray(scores);
    }

    public static void printArray(int[] arr)
    {
        for (int v : arr)
        {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}

// 1. A for-each loop can't modify array elements because it only
// recieves the values of the elements, not their indexes, so the
// values of specific positions can't be accessed/modified.

// 2. Aliasing creates another name that refers to the array, making
// it easier for the values in the array to be unintentionally
// manipulated because aliasing doesn't actually make a copy, which
// can be dangerous if you don't know that it's a copy.

// 3. You should be careful after sorting an array because indexes
// now refer to different values.