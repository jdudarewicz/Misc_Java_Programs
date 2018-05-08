import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any interger, and I will tell you if it's even or odd:");
        int NumberInput = in.nextInt();

        if (NumberInput % 2 == 0)
        {
            System.out.println("Your number is even!");
        }
        else
        {
            System.out.println("Your number is odd!");
        }
    }
}