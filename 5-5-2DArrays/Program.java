import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[][] grid = {
            {3, 5, 7},
            {1, 4, 9},
            {8, 6, 2}
        };

        System.out.println("Center (1,1): " + grid[1][1]);
        System.out.println("Top-right (0,2): " + grid[0][2]);

        grid[2][0] = 99;

        System.out.println("Updated bottom-left (2,0): " + grid[2][0]);
        grid[2][0] = 8;
        System.out.println();
        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[r].length; c++)
            {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        int max = grid[0][0];
        int evenCount = 0;

        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[r].length; c++)
            {
                int value = grid[r][c];
                sum += value;

                if (value > max)
                {
                    max = value;
                }

                if (value % 2 == 0)
                {
                    evenCount++;
                }
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Even count: " + evenCount);
        System.out.println();


        int[][] steps =
        {
            {5200, 6100, 4300, 7000, 8000, 12000, 9000},
            {8000, 7800, 8200, 7900, 8100, 8300, 7600},
            {3000, 4500, 5000, 4000, 6500, 7000, 6000}
        };

        int bestPerson = 0;
        int bestTotal = 0;

        for (int r = 0; r < steps.length; r++)
        {
            int rowSum = 0;

            for (int c = 0; c < steps[r].length; c++)
            {
                rowSum += steps[r][c];
            }

            System.out.println("Person " + r + " weekly total: " + rowSum);

            if (r == 0 || rowSum > bestTotal)
            {
                bestTotal = rowSum;
                bestPerson = r;
            }
        }

        System.out.println("Highest weekly total: Person " + bestPerson);
        System.out.println("Total steps: " + bestTotal);
        System.out.println();


        int[][] grades =
        {
            {90, 82, 88, 100},
            {70, 85, 79, 92},
            {95, 91, 93, 89}
        };

        for (int r = 0; r < grades.length; r++)
        {
            int gsum = 0;

            for (int c = 0; c < grades[r].length; c++)
            {
                gsum += grades[r][c];
            }

            double avg = (double) gsum / grades[r].length;
            System.out.println("Student " + r + " average: " + avg);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student number (0-2): ");
        int student = scanner.nextInt();

        if (student < 0 || student >= grades.length)
        {
            System.out.println("Invalid student number.");
        }
        else
        {
            System.out.print("Student " + student + " scores: ");
            for (int c = 0; c < grades[student].length; c++)
            {
                System.out.print(grades[student][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
        scanner.close();

        int[][] seats =
        {
            {0, 0, 1, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0}
        };

        int occupied = 0;
        int empty = 0;

        for (int r = 0; r < seats.length; r++)
        {
            for (int c = 0; c < seats[r].length; c++)
            {
                if (seats[r][c] == 1)
                {
                    occupied++;
                    System.out.println("Occupied at (" + r + ", " + c + ")");
                }
                else
                {
                    empty++;
                }
            }
        }

        System.out.println("Occupied seats: " + occupied);
        System.out.println("Empty seats: " + empty);
    }
}

// 1. Rows represent arrays within the 2D array, while columns
// represent the elements within those arrays.

// 2. grid.length represents the amount of rows in the 2D array,
// while grid[r].length represents the amount of elements in a
// specific row in the 2D array.

// 3. We use nested loops because the outside loop traverses the
// rows/arrays, while the inside loop traverses each individual
// column/element within the specific row/array.

// 4. We reset rowSum back to 0 for each new row so that it doesn't
// still carry the sum of the values from the previous row.

// 5. A 2D array makes sense for playing a digital tic-tac-toe game.