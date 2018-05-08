import java.util.Scanner;

public class Factors
{
    public static void main(String[] args)
    {
        int i = 1;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an interger you want to factor: ");

        int userInput = in.nextInt();

        while (i < userInput)
        {
            if ((userInput % i) == 0)
            {
                System.out.println(i);
            }
        i++;
        }
    }
}