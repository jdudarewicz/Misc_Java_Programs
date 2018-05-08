import java.util.Scanner;

public class PhoneNumber
{
    public static void main(String[] args)
    {
       System.out.println("Eneter your phone number, making sure it's only 10 numbers long");
       Scanner input = new Scanner(System.in);
       String phoneNumber = input.nextLine();

       System.out.printf("(" + phoneNumber.substring(0,3) + ") " + phoneNumber.substring(3,6) + " - " + phoneNumber.substring(6,10) + "\n" );
    }
}