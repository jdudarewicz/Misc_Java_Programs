import java.util.*;

public class NumberOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int userInput = in.nextInt();

        System.out.println("There are " + NumberOfDigits(userInput) + " digits in your number.");
    }

    public static int NumberOfDigits(int input)
    {
        if (input < 10)
            {
                return input;
            }
        
        return NumberOfDigits(input / 10) + 1;
    }
}