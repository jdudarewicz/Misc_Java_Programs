import java.util.Scanner;

public class TaxBrackets
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Are you married? (\"yes\" or \"no\"): ");
        String maritalStatus = in.next();
        double income = 0;
        double taxOwed = 0;

        if(maritalStatus.equals("yes"))
        {
            System.out.println("What is your income?: ");
            income = in.nextDouble();
            
            if (income > 64000)
            {
                taxOwed = (income * 0.25) + 8800;
            }
            else if (income > 16000)
            {
                taxOwed = (income * 0.15) + 1600;
            }
            else if (income <= 16000 && income > 0)
            {
                taxOwed = income * 0.10;
            }

            System.out.printf("You owe $" + "%.2f",taxOwed);
            System.out.print(" in taxes.");
        }
        else if(maritalStatus.equals("no"))
        {
            System.out.println("What is your income? : "); 
            income = in.nextDouble();

            if (income > 32000)
            {
                taxOwed = (income * 0.25) + 4400;
            }
            else if (income > 8000)
            {
                taxOwed = (income * 0.15) + 800;
            }
            else if (income <= 8000 && income > 0)
            {
                taxOwed = income * 0.10;
            }
            System.out.printf("You owe $" + "%.2f",taxOwed);
            System.out.print(" in taxes.");
        }
        else
        {
            System.out.println("Incorrect value");
        }
    }
}