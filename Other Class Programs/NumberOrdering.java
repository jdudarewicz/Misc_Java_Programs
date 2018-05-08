import java.util.Scanner;

public class NumberOrdering
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        
        System.out.println("This program indicates whether a set of three numbers are in order!");
        
        System.out.print("Enter an integer x: ");
        x = in.nextInt();

        System.out.print("Enter an integer y: ");
        y = in.nextInt();

        System.out.print("Enter an integer z: ");
        z = in.nextInt();

        if (x < y && y < z)
        {
            System.out.print("Ascending order");
        }
        else if (x > y && y > z)
        {
            System.out.print("Descending order");
        }
        else
        {
            System.out.print("Numbers are not ascending or descending.");
        }
    }
}