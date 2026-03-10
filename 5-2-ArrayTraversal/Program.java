public class Program
{
  public static void main(String[] args)
  {
    int[] nums = {4, 7, 2, 9, 5};

    for (int i = 0; i < nums.length; i++)
    {
      System.out.println("Value: " + nums[i]);
    }

    int[] scores = {84, 91, 76, 88, 95};

    int sum = 0;

    for (int i = 0; i < scores.length; i++)
    {
      sum += scores[i];
    }

    double avg = (double) sum / scores.length;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);

    int[] temps = {72, 68, 75, 70, 69, 76, 71};

    int count = 0;

    for (int i = 0; i < temps.length; i++)
    {
      if (temps[i] >= 72)
      {
        count++;
      }
    }

    System.out.println("Temps >= 72: " + count);

    int min = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min)
      {
        min = nums[i];
      }
      if (nums[i] > max)
      {
        max = nums[i];
      }
    }

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}

// 1. Traversing an array means to loop through the contents of
// the array.

// 2. i < arr.length is correct because the highest value for i
// is one less than arr.length, because i starts at 0, not 1. If
// i <= arr.length was used, then it would be incorrect because
// there is no possibility for i to be equal to arr.length.

// 3. i is the index of the value. arr[i] is the actual value/the
// element.