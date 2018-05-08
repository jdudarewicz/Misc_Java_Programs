import java.util.Scanner;
//* Helps a person decide if they want to buy a hybrid*//

public class HybridCar
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("This program helps you price out the total cost of purchasing a new hybrid over 5 years!");

        System.out.println("Enter the name of your desired hybrid:");
        String name = in.next();

        System.out.println("Enter the new price of your desired hybrid:");
        int newHybrid = in.nextInt();
        
        System.out.println("Enter your desired hybrids estimated litres/100 kilometers:");
        double litresPerKilo = in.nextDouble();
        litresPerKilo = litresPerKilo / 100;

        System.out.println("Enter how many kilometers a year you drive/plan to drive:");
        int kiloPerYear = in.nextInt();

        System.out.println("Enter the average cost per litre of gas in your area:");
        double gasCost = in.nextDouble();

        System.out.println("Enter the average price of a used model of your desired hybrid, after 5 years:");
        int usedHybrid = in.nextInt();

        double totalCost = (newHybrid + (5*(kiloPerYear*(gasCost*litresPerKilo)))) - usedHybrid;

        System.out.println("Total cost of owning a(n) " + name + " over 5 years is " + totalCost);
    }
}