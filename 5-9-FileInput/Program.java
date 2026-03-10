import java.io.File;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("gradebook.txt");
        Scanner input = new Scanner(file);

        String bestName = "";
        double bestAvg = -1;

        while (input.hasNext())
        {
            String name = input.next();

            int s1 = input.nextInt();
            int s2 = input.nextInt();
            int s3 = input.nextInt();
            int s4 = input.nextInt();

            int sum = s1 + s2 + s3 + s4;
            double avg = sum / 4.0;

            System.out.println(name + " average: " + avg);

            if (avg > bestAvg)
            {
                bestAvg = avg;
                bestName = name;
            }
        }

        input.close();

        System.out.println("Top average: " + bestName + " (" + bestAvg + ")");
    }
}
