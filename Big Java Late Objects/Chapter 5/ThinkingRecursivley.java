import java.util.*;

public class ThinkingRecursivley
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the digits that you want to add together: ");
        int userInput = in.nextInt();
        System.out.println(digitSum(userInput));
    }
    
    public static int digitSum(int digits)
    {
        if (digits == 0)
            {return 0;}
        return digitSum(digits/10) + digits % 10;
    }
}