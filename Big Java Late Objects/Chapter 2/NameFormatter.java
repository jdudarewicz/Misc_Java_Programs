import java.util.Scanner;

public class NameFormatter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your first name");
        String first = in.next();

        System.out.println("Enter your middle name");
        String middle = in.next();

        System.out.println("Enter your last name");
        String last = in.next();

        System.out.println(first + " " + middle.substring(0,1) + ". " + last);
    }
}