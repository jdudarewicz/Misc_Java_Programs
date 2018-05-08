import java.util.Scanner;

public class Change
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the total due (in pennies): ");
        int total = in.nextInt();
        System.out.print("Please enter the amount given (in pennies): ");
        int changeRecieved = in.nextInt();

        int changeNeeded = changeRecieved - total;

        int loonies = changeNeeded / 100;
        changeNeeded = changeNeeded % 100;
        int quarters = changeNeeded / 25;
        changeNeeded = changeNeeded % 25;
        int dimes = changeNeeded / 10;
        changeNeeded = changeNeeded % 10;
        int nickles = changeNeeded / 5;
        changeNeeded = changeNeeded % 5;
        int pennies = changeNeeded;

        System.out.println("The customer is to recieve: " + loonies + " loonie(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickles + " nickle(s), and " + pennies + " pennie(s).");
    }
}