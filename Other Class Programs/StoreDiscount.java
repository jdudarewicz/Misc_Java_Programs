import java.util.Scanner;

public class StoreDiscount
{
    public static void main(String[] args)
    {
        final double DISCOUNT10 = 0.10;
        final double DISCOUNT25 = 0.25;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of your items: ");
        double price = in.nextDouble();
        double finalPrice = price;

        if (price >= 50.0 && price <= 100)
        {
            finalPrice = price - (price*DISCOUNT10);
        }
        else if (price > 100.0)
        {
            finalPrice = price - (price*DISCOUNT25);
        }

        System.out.printf("The final price of your shopping is $" + "%.2f", finalPrice);
    }
}