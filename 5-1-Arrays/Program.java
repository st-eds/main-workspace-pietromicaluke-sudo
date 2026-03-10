import java.util.Arrays;

public class Program {
  public static void main(String[] args) {
    String[] classes = {"Math", "English", "Science", "History"};

    System.out.println("First class: " + classes[0]);
    System.out.println("Last class: " + classes[3]);
    System.out.println("Number of classes: " + classes.length);

    int[] temps = {72, 68, 75, 70, 69};

    System.out.println("Temp at index 2: " + temps[2]);

    temps[0] = 74;
    temps[temps.length - 1] = 71;

    System.out.println("Updated temps: " + Arrays.toString(temps));

    int[] points = new int[3];

    points[0] = 10;
    points[1] = 15;
    points[2] = 20;

    System.out.println("Points: " + Arrays.toString(points));

    int[] nums = {4, 7, 2, 9};

    int sum = nums[0] + nums[nums.length - 1];
    int diff = nums[1] - nums[2];

    System.out.println("First + Last: " + sum);
    System.out.println("Second - Third: " + diff);
  }
}

// 1. An index is the position of the value in the array, while the
// element is the value itself.

// 2. The last index equals length - 1 because the index starts at
// zero, so the length is one greater than the largest index.

// 3. Creating an empty array eould be useful when the values aren't
// determined yet.

// 4. We needed an import statement in order to use the helper tool
// of Arrays.toString.