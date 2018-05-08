import java.util.*;

public class InputValidation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to add. Type a letter to quit: ");
        int sum = 0;

        while(in.hasNextInt())
            {
                int input = in.nextInt();
                sum = sum + input;
            }
        
        System.out.println(sum);
    }
}