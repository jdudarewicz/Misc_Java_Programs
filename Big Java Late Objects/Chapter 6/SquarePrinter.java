import java.util.*;

public class SquarePrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int MAXARRAYLENGTH = 100;
        int[] values = new int[MAXARRAYLENGTH];
        int currentLength = 0;

        System.out.print("Enter a value, of which all the squares from 1 to that number will be printed (up to 100): ");
        int userInput = in.nextInt();

        for (int i = 0; i < userInput; i++)
            {
                values[i] = i + 1;
                currentLength++;
            }

        values = squares(values);
        int[] squared = Arrays.copyOf(values, currentLength);
        System.out.println(Arrays.toString(squared));
    }

    public static int[] squares(int[] input)
    {
        for (int i = 0; i < input.length; i++)
            {
                input[i] = input[i] * input[i];
            }
        
        return input;
    }
}