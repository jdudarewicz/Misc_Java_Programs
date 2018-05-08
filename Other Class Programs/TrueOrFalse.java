import java.util.Scanner;

public class TrueOrFalse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in an interger x, where -5 <= x <= 5:");
        int x = in.nextInt();

        if (x >= 5 || x <= -5)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}