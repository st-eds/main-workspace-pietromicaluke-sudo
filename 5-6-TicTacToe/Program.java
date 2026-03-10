import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        char[][] board =
        {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        Scanner scanner = new Scanner(System.in);

        char currentPlayer = 'X';

        while (true)
        {
            printBoard(board);

            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();

            System.out.print("Enter col (0-2): ");
            int col = scanner.nextInt();

            if (!isValidMove(board, row, col))
            {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (checkWin(board, currentPlayer))
            {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull(board))
            {
                printBoard(board);
                System.out.println("It's a tie!");
                break;
            }

            if (currentPlayer == 'X')
            {
                currentPlayer = 'O';
            }
            else
            {
                currentPlayer = 'X';
            }
        }

        scanner.close();
    }

    public static void printBoard(char[][] board)
    {
        System.out.println();
        System.out.println("   0   1   2");
        System.out.println("  -----------");

        for (int r = 0; r < board.length; r++)
        {
            System.out.print(r + " |");

            for (int c = 0; c < board[r].length; c++)
            {
                System.out.print(" " + board[r][c] + " |");
            }

            System.out.println();
            System.out.println("  -----------");
        }

        System.out.println();
    }

    public static boolean isValidMove(char[][] board, int row, int col)
    {
        if (row < 0 || row >= board.length)
        {
            return false;
        }

        if (col < 0 || col >= board[row].length)
        {
            return false;
        }

        if (board[row][col] != '-')
        {
            return false;
        }

        return true;
    }

    public static boolean checkWin(char[][] board, char player)
    {
        for (int r = 0; r < board.length; r++)
        {
            if (board[r][0] == player && board[r][1] == player && board[r][2] == player)
            {
                return true;
            }
        }

        for (int c = 0; c < board[0].length; c++)
        {
            if (board[0][c] == player && board[1][c] == player && board[2][c] == player)
            {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board)
    {
        for (int r = 0; r < board.length; r++)
        {
            for (int c = 0; c < board[r].length; c++)
            {
                if (board[r][c] == '-')
                {
                    return false;
                }
            }
        }

        return true;
    }
}

// 1. A 2D array is a good choice to represent the Tic-Tac-Toe board
// because of the board's grid-like structure that mirrors the
// structure of a 2D array (which also has rows and columns).

// 2. The position selected must be on the board (row and column
// must be between 0 and 2 each) and the position selected cannot be
// already filled.

// 3. The checkWin method evaluates every possible winning
// combination on the table by looking to see if the values of
// certain positions are equal to determine if a player has won or
// not. It does this by looping through the rows and columns of the
// board and checking if the values are all the same.

// 4. It is helpful to move win checking and printing into seperate
// methods because they have seperate functions and doing this would
// make the code more readable and organized.

// 5. The hardest bug I ran into was trying to type the nested for
// loops in the isBoardFull method.