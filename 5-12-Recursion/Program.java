public class Program
{
    public static void main(String[] args)
    {
        countdown(5);

        System.out.println(power(2, 3));

        int[] nums = {4, 7, 2, 9, 5};
        System.out.println(max(nums, 0));

        int[] nums1 = {3, 8, 1, 6, 9};

        System.out.println(contains(nums1, 6, 0));
        System.out.println(contains(nums1, 5, 0));
    }

    public static void countdown(int n)
    {
        if (n <= 0)
            return;
        
        System.out.println(n);
        countdown(n-1);
    }

    public static int power(int base, int exponent)
    {
        if (exponent == 0)
            return 1;
        if (exponent > 0)
            return base * power(base, exponent - 1);
        return 0;
    }

    public static int max(int[] arr, int index)
    {
        if (index == arr.length - 1)
            return arr[index];
        return arr[index] > max(arr, index + 1) ? arr[index] : max(arr, index + 1);
    }

    public static boolean contains(int[] arr, int target, int index)
    {
        if (index == arr.length)
            return false;
        if (arr[index] == target)
            return true;
        return contains(arr, target, index + 1);
    }
}

// 1. The base case in a recursive method is the stopping condition
// in the method.

// 2. If you forget the base case, infinite recursion occurs, which
// causes a StackOverflowError.

// 3. Recursion is similar to a loop because it runs through the same
// process multiple times until a specific goal is reached.

// 4. Recursion is different from a loop because it has the ability to
// call the same method within itself unlike how a loop can't call the
// same loop inside itself.

// 5. Recursion can be clearer than iteration because it requires less
// code and just runs through the same process multiple times rather
// than creating a ton of new ones.