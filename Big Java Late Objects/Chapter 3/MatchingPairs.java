import java.util.Scanner;

public class MatchingPairs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 4 integers:");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int four = in.nextInt();

        if ((one == two || one == three || one == four) && (two == one || two == three || two == four))
        {
            System.out.println("Two pairs");
        }
        else
        {
            System.out.println("Not two pairs");
        }
    }
}