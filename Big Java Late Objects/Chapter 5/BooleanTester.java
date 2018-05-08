import java.util.Scanner;

public class BooleanTester
{
    public static boolean allTheSame(double x, double y, double z)
    {
        if (x == y && y == z)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

    public static boolean allDifferent(double x, double y, double z)
    {
        if (x != y && y != z)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

    public static boolean allSorted(double x, double y, double z)
    {
        if (x > y && y > z)
            {
                return true;
            }
        else if (z > y && y > x)
            {
                return true;
            }
        else
            {
                return false;
            }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a set of 3 numbers:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        boolean theSame = allTheSame(x,y,z);
        boolean different = allDifferent(x,y,z);
        boolean sorted = allSorted(x,y,z);

        System.out.println("All the same: " + theSame);
        System.out.println("All different: " + different);
        System.out.println("Sorted: " + sorted);
    }
}