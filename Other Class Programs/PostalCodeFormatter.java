import java.util.Scanner;

public class PostalCodeFormatter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your postal code:");
        String PostalCode = in.next();

        System.out.printf(PostalCode.substring(0,3) + " - " + PostalCode.substring(3,6));
    }
}