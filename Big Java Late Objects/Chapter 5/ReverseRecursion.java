import java.util.*;

public class ReverseRecursion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string you want reversed: ");
        String userInput = in.next();
        reverser(userInput, userInput.length() - 1);
    }

    public static void reverser(String original, int length)
    {
        String reversed = "";
        if (length < 0)
            {return;}
        else
            {
                reversed = reversed + original.charAt(length);
            }
        System.out.print(reversed);
        reverser(original, length - 1);
    }
}