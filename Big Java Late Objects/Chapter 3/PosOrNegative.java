import java.util.Scanner;

public class PosOrNegative
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = in.nextInt();
        
        if (x > 0)
        {
            System.out.println("That's positive.");
        }
        else if (x < 0)
        {
            System.out.println("That's negative.");
        }
        else 
        System.out.println("That's not positive or negative.");
    }
}