import java.util.Scanner;

public class TaxBracket
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your income: $");
        double income = in.nextDouble();

        if (income > 500000)
        {
            System.out.println("Your income tax is 6%");
            income = income * 0.06;
            System.out.printf("You owe : $" + "%.2f\n", income);
        }
        else if (income > 250000)
        {
            System.out.println("Your income tax is 5%");
            income = income * 0.05;
            System.out.printf("You owe : $" + "%.2f\n", income);
        }
        else if (income > 100000)
        {
            System.out.println("Your income tax is 4%");
            income = income * 0.04;
            System.out.printf("You owe : $" + "%.2f\n", income);
        }
        else if (income > 75000)
        {
            System.out.println("Your income tax is 3%");
            income = income * 0.03;
            System.out.printf("You owe : $" + "%.2f\n", income);
        }
        else if (income > 50000)
        {
            System.out.println("Your income tax is 2%");
            income = income * 0.02;
            System.out.printf("You owe : $" + "%.2f\n", income);
        }
        else if (income > 0)
        {
            System.out.println("Your income tax is 1%");
            income = income * 0.01;
            System.out.printf("You owe : $" + "%.2f\n", income);
        }
        else
        {
            System.out.println("You owe nothing.");
        }
    }
}