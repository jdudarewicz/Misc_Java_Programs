import java.util.Scanner;

public class IOrD
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a x value: ");
        int x = in.nextInt();
        System.out.print("Please enter a y value: ");
        int y = in.nextInt();
        System.out.print("Please enter a z value: ");
        int z = in.nextInt();

        if (x < y && y < z)
        {
            System.out.println("Increasing.");
        }
        else if (z < y && y < x)
        {
            System.out.println("Decreasing.");
        }
        else
        {
            System.out.println("Neither.");
        }
    }
}