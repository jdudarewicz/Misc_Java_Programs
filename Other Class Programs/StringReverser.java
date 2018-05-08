import java.util.*;

public class StringReverser
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word you want to reverse");
        String userInput = in.next();
        System.out.println(reverseString(userInput));
    }

    public static String reverseString(String input)
    {
        if (input.length() <= 1)
            {
                return input;
            }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}