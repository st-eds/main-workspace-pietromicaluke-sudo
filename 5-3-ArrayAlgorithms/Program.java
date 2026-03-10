public class Program
{
    public static void main(String[] args)
    {
        int[] nums = {4, 7, 2, 9, 5};

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
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

        int[] nums1 = {10, 20, 30, 40};

        int temp = nums1[0];
        nums1[0] = nums1[3];
        nums1[3] = temp;

        for (int i = 0; i < nums1.length; i++)
        {
            System.out.println(nums1[i]);
        }

        int[] nums2 = {4, 7, 2, 9, 5};
        int target = 9;

        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < nums2.length; i++)
        {
            if (nums2[i] == target)
            {
                found = true;
                foundIndex = i;
            }
        }

        System.out.println("Found: " + found);
        System.out.println("Index: " + foundIndex);

        int[] nums3 = {2, 4, 7, 9, 12, 15};
        int target1 = 12;

        int low = 0;
        int high = nums3.length - 1;

        boolean found1 = false;
        int foundIndex1 = -1;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (nums3[mid] == target1)
            {
                found1 = true;
                foundIndex1 = mid;
                break;
            }
            else if (nums3[mid] < target1)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("Found: " + found1);
        System.out.println("Index: " + foundIndex1);
    }
}

// 1. Swapping requires a temporary value because if a temporary
// value is not used then the first value changed is lost before
// being put in the second value's position.

// 2. We use -1 because index starts at 0 so negative numbers are
// not possible. Thus, if -1 is returned then it is implied that
// there is no value.

// 3. Binary search starts from the middle and cuts out half of the
// possible values every iteration, whereas linear seacrh starts at
// one value and evaluates every value until the desired one is
// found.

// 4. Binary search eliminates values based on their numeric order,
// so the values must be sorted from least to greatest.

// 5. Linear